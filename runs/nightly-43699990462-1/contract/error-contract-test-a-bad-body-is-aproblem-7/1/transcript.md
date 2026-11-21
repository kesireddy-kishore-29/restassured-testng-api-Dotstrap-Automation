# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [PATCH /v1/accounts/me, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[7]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 25 | `qa-322133b6-730e-45b5-b764-153a20430c4b` |
| 2 | `POST /v1/accounts` | 201 | 19 | `qa-48d6f533-4912-4e0e-ba75-38fcf6c0ea10` |
| 3 | `POST /v1/auth/token` | 200 | 25 | `qa-ae08115b-f6fb-4761-bc76-2427eceb2ebb` |
| 4 | `POST /v1/conversations` | 201 | 15 | `qa-abe3a885-379f-4ab5-82e2-4b07efacc1c5` |
| 5 | `PATCH /v1/accounts/me` | 415 | 9 | `qa-13bbb074-29ed-4856-805b-0c5d61fedd2b` |
| 6 | `POST /v1/auth/token` | 200 | 15 | `qa-2a3a9136-2650-4880-94d0-746bac3f4246` |
| 7 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-56cc119c-6fc7-4f75-bd7d-dd6b86a3086d` |
| 8 | `POST /v1/auth/token` | 401 | 6 | `qa-2955d45d-8ef9-4805-8eed-d24c53bba744` |
| 9 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-429d6133-ea67-429c-b138-fc76bada48ca` |
| 10 | `POST /v1/auth/token` | 401 | 25 | `qa-35e5a9a5-8f85-4328-9cfc-41e0e638bf2e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-322133b6-730e-45b5-b764-153a20430c4b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-322133b6-730e-45b5-b764-153a20430c4b
Content-Type: application/json

--- request body ---
{"handle":"qa-48a486621f7b","displayName":"QA 48a486621f7b","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-322133b6-730e-45b5-b764-153a20430c4b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 467
RateLimit-Reset: 8
Location: /v1/accounts/qa-48a486621f7b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_146d1762-dbea-4c1d-9429-b1ecd5aad67c","handle":"qa-48a486621f7b","displayName":"QA 48a486621f7b","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.468005135Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-48d6f533-4912-4e0e-ba75-38fcf6c0ea10

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-48d6f533-4912-4e0e-ba75-38fcf6c0ea10
Content-Type: application/json

--- request body ---
{"handle":"qa-bcda5b675d55","displayName":"QA bcda5b675d55","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-48d6f533-4912-4e0e-ba75-38fcf6c0ea10
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 460
RateLimit-Reset: 8
Location: /v1/accounts/qa-bcda5b675d55
X-Served-Region: eu
Content-Length: 181

{"id":"acc_db12f06e-92ef-40f7-a2e9-2a139d2507ca","handle":"qa-bcda5b675d55","displayName":"QA bcda5b675d55","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.498690949Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-ae08115b-f6fb-4761-bc76-2427eceb2ebb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae08115b-f6fb-4761-bc76-2427eceb2ebb
Content-Type: application/json

--- request body ---
{"handle":"qa-48a486621f7b","password":"****"}

--- response: 200 in 25 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-ae08115b-f6fb-4761-bc76-2427eceb2ebb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 455
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_146d1762-dbea-4c1d-9429-b1ecd5aad67c"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-abe3a885-379f-4ab5-82e2-4b07efacc1c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-abe3a885-379f-4ab5-82e2-4b07efacc1c5
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-bcda5b675d55","subject":"Error contract","message":"Hi"}

--- response: 201 in 15 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-abe3a885-379f-4ab5-82e2-4b07efacc1c5
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
Location: /v1/conversations/cnv_9a57b4bd-1d94-40a4-bd29-23e305a472c5
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_9a57b4bd-1d94-40a4-bd29-23e305a472c5","subject":"Error contract","status":"open","region":"eu","participants":["qa-48a486621f7b","qa-bcda5b675d55"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-15T09:36:09.558928977Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-13bbb074-29ed-4856-805b-0c5d61fedd2b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-13bbb074-29ed-4856-805b-0c5d61fedd2b
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 9 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-13bbb074-29ed-4856-805b-0c5d61fedd2b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 255

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/accounts/me","correlationId":"qa-13bbb074-29ed-4856-805b-0c5d61fedd2b"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-2a3a9136-2650-4880-94d0-746bac3f4246

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2a3a9136-2650-4880-94d0-746bac3f4246
Content-Type: application/json

--- request body ---
{"handle":"qa-bcda5b675d55","password":"****"}

--- response: 200 in 15 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-2a3a9136-2650-4880-94d0-746bac3f4246
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 433
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_db12f06e-92ef-40f7-a2e9-2a139d2507ca"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-56cc119c-6fc7-4f75-bd7d-dd6b86a3086d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-56cc119c-6fc7-4f75-bd7d-dd6b86a3086d
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: text/plain
X-Correlation-Id: qa-56cc119c-6fc7-4f75-bd7d-dd6b86a3086d
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
correlation: qa-2955d45d-8ef9-4805-8eed-d24c53bba744

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2955d45d-8ef9-4805-8eed-d24c53bba744
Content-Type: application/json

--- request body ---
{"handle":"qa-bcda5b675d55","password":"****"}

--- response: 401 in 6 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2955d45d-8ef9-4805-8eed-d24c53bba744
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 430
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2955d45d-8ef9-4805-8eed-d24c53bba744"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-429d6133-ea67-429c-b138-fc76bada48ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-429d6133-ea67-429c-b138-fc76bada48ca
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: text/plain
X-Correlation-Id: qa-429d6133-ea67-429c-b138-fc76bada48ca
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-35e5a9a5-8f85-4328-9cfc-41e0e638bf2e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35e5a9a5-8f85-4328-9cfc-41e0e638bf2e
Content-Type: application/json

--- request body ---
{"handle":"qa-48a486621f7b","password":"****"}

--- response: 401 in 25 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-35e5a9a5-8f85-4328-9cfc-41e0e638bf2e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 419
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-35e5a9a5-8f85-4328-9cfc-41e0e638bf2e"}
```
