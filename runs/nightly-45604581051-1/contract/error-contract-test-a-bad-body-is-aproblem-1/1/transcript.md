# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/auth/token, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[1]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 28 | `qa-58635e1f-56a3-4cd3-958a-86c8e251fce7` |
| 2 | `POST /v1/accounts` | 201 | 25 | `qa-8e2aa3ea-ee82-4808-9574-66c8827cb992` |
| 3 | `POST /v1/auth/token` | 200 | 29 | `qa-271dd3ee-51c8-49cc-9e2a-19e4f6d197ed` |
| 4 | `POST /v1/conversations` | 201 | 10 | `qa-32ca1b91-99e6-4b44-b138-20f7c980a4ca` |
| 5 | `POST /v1/auth/token` | 415 | 49 | `qa-26a6b166-1d9c-4126-b398-ba1616c1543a` |
| 6 | `POST /v1/auth/token` | 200 | 30 | `qa-c9164686-eecf-4ced-8e73-2686aed32185` |
| 7 | `DELETE /v1/accounts/me` | 204 | 27 | `qa-80ac9430-8ae1-4d69-8094-c4c5596858a2` |
| 8 | `POST /v1/auth/token` | 401 | 15 | `qa-a18a9cb5-add3-4938-a197-201a5469b3c3` |
| 9 | `DELETE /v1/accounts/me` | 204 | 34 | `qa-fd47d00d-5e6e-4a6d-9c55-1e6b7439106a` |
| 10 | `POST /v1/auth/token` | 401 | 53 | `qa-8897ca01-ffcb-4b25-8a89-a9a7fff497b2` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-58635e1f-56a3-4cd3-958a-86c8e251fce7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-58635e1f-56a3-4cd3-958a-86c8e251fce7
Content-Type: application/json

--- request body ---
{"handle":"qa-9bacff0c03a2","displayName":"QA 9bacff0c03a2","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-58635e1f-56a3-4cd3-958a-86c8e251fce7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 10
Location: /v1/accounts/qa-9bacff0c03a2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_30930bd5-6236-42d4-b13e-b206051a2ae8","handle":"qa-9bacff0c03a2","displayName":"QA 9bacff0c03a2","region":"eu","role":"user","createdAt":"2026-11-25T11:27:57.195959503Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-8e2aa3ea-ee82-4808-9574-66c8827cb992

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e2aa3ea-ee82-4808-9574-66c8827cb992
Content-Type: application/json

--- request body ---
{"handle":"qa-50f8b776c1e0","displayName":"QA 50f8b776c1e0","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-8e2aa3ea-ee82-4808-9574-66c8827cb992
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 568
RateLimit-Reset: 10
Location: /v1/accounts/qa-50f8b776c1e0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_08117ca5-dd29-4c2a-92ed-bef4add3d498","handle":"qa-50f8b776c1e0","displayName":"QA 50f8b776c1e0","region":"eu","role":"user","createdAt":"2026-11-25T11:27:57.222681408Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-271dd3ee-51c8-49cc-9e2a-19e4f6d197ed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-271dd3ee-51c8-49cc-9e2a-19e4f6d197ed
Content-Type: application/json

--- request body ---
{"handle":"qa-9bacff0c03a2","password":"****"}

--- response: 200 in 29 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-271dd3ee-51c8-49cc-9e2a-19e4f6d197ed
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 558
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_30930bd5-6236-42d4-b13e-b206051a2ae8"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-32ca1b91-99e6-4b44-b138-20f7c980a4ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-32ca1b91-99e6-4b44-b138-20f7c980a4ca
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-50f8b776c1e0","subject":"Error contract","message":"Hi"}

--- response: 201 in 10 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-32ca1b91-99e6-4b44-b138-20f7c980a4ca
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
Location: /v1/conversations/cnv_cc9e9d26-78ed-4c05-aa9e-9ca7d04585d6
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_cc9e9d26-78ed-4c05-aa9e-9ca7d04585d6","subject":"Error contract","status":"open","region":"eu","participants":["qa-9bacff0c03a2","qa-50f8b776c1e0"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-25T11:27:57.291687831Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-26a6b166-1d9c-4126-b398-ba1616c1543a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-26a6b166-1d9c-4126-b398-ba1616c1543a
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 49 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-26a6b166-1d9c-4126-b398-ba1616c1543a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 540
RateLimit-Reset: 10
Content-Length: 254

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/auth/token","correlationId":"qa-26a6b166-1d9c-4126-b398-ba1616c1543a"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-c9164686-eecf-4ced-8e73-2686aed32185

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c9164686-eecf-4ced-8e73-2686aed32185
Content-Type: application/json

--- request body ---
{"handle":"qa-50f8b776c1e0","password":"****"}

--- response: 200 in 30 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-c9164686-eecf-4ced-8e73-2686aed32185
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 518
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_08117ca5-dd29-4c2a-92ed-bef4add3d498"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-80ac9430-8ae1-4d69-8094-c4c5596858a2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-80ac9430-8ae1-4d69-8094-c4c5596858a2
Content-Type: application/json

--- response: 204 in 27 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-80ac9430-8ae1-4d69-8094-c4c5596858a2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-a18a9cb5-add3-4938-a197-201a5469b3c3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a18a9cb5-add3-4938-a197-201a5469b3c3
Content-Type: application/json

--- request body ---
{"handle":"qa-50f8b776c1e0","password":"****"}

--- response: 401 in 15 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a18a9cb5-add3-4938-a197-201a5469b3c3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 499
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a18a9cb5-add3-4938-a197-201a5469b3c3"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fd47d00d-5e6e-4a6d-9c55-1e6b7439106a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd47d00d-5e6e-4a6d-9c55-1e6b7439106a
Content-Type: application/json

--- response: 204 in 34 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fd47d00d-5e6e-4a6d-9c55-1e6b7439106a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-8897ca01-ffcb-4b25-8a89-a9a7fff497b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8897ca01-ffcb-4b25-8a89-a9a7fff497b2
Content-Type: application/json

--- request body ---
{"handle":"qa-9bacff0c03a2","password":"****"}

--- response: 401 in 53 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8897ca01-ffcb-4b25-8a89-a9a7fff497b2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 472
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8897ca01-ffcb-4b25-8a89-a9a7fff497b2"}
```
