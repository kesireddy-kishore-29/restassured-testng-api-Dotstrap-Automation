# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations/{id}/messages, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[12]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 18 | `qa-6d01f57f-a215-4183-9bba-13c897952349` |
| 2 | `POST /v1/accounts` | 201 | 46 | `qa-d0af456b-317a-4de6-8fbf-c16e2fe996ba` |
| 3 | `POST /v1/auth/token` | 200 | 21 | `qa-5b27a884-948c-40fb-8349-811c443609d5` |
| 4 | `POST /v1/conversations` | 201 | 14 | `qa-2a43e738-63c8-4647-8a96-661f1b7d1483` |
| 5 | `POST /v1/conversations/{id}/messages` | 400 | 6 | `qa-4516715c-458d-473f-b9f0-9dcabf1391de` |
| 6 | `POST /v1/auth/token` | 200 | 9 | `qa-a92f244e-4574-4eb8-ba92-2aa97a246b5c` |
| 7 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-02dc4d51-595d-4a16-96c6-12d0220f0f2e` |
| 8 | `POST /v1/auth/token` | 401 | 9 | `qa-d58b6bfd-6230-4089-882f-07e90c1053c5` |
| 9 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-906ef5c8-01c6-4f07-b35b-7fc4d92a13e2` |
| 10 | `POST /v1/auth/token` | 401 | 6 | `qa-5c2fa864-8737-4c13-96e5-70d45dc7a5ce` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6d01f57f-a215-4183-9bba-13c897952349

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6d01f57f-a215-4183-9bba-13c897952349
Content-Type: application/json

--- request body ---
{"handle":"qa-bbc159429617","displayName":"QA bbc159429617","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-6d01f57f-a215-4183-9bba-13c897952349
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 363
RateLimit-Reset: 8
Location: /v1/accounts/qa-bbc159429617
X-Served-Region: eu
Content-Length: 181

{"id":"acc_da0c19e0-4acb-4cef-ba0b-51523b4cbab9","handle":"qa-bbc159429617","displayName":"QA bbc159429617","region":"eu","role":"user","createdAt":"2026-11-22T09:54:42.014921646Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-d0af456b-317a-4de6-8fbf-c16e2fe996ba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0af456b-317a-4de6-8fbf-c16e2fe996ba
Content-Type: application/json

--- request body ---
{"handle":"qa-a6950e06e379","displayName":"QA a6950e06e379","password":"****","region":"eu"}

--- response: 201 in 46 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-d0af456b-317a-4de6-8fbf-c16e2fe996ba
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 359
RateLimit-Reset: 8
Location: /v1/accounts/qa-a6950e06e379
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d3606f54-5ed5-4afc-a471-0b7f234a1660","handle":"qa-a6950e06e379","displayName":"QA a6950e06e379","region":"eu","role":"user","createdAt":"2026-11-22T09:54:42.042180042Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-5b27a884-948c-40fb-8349-811c443609d5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b27a884-948c-40fb-8349-811c443609d5
Content-Type: application/json

--- request body ---
{"handle":"qa-bbc159429617","password":"****"}

--- response: 200 in 21 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-5b27a884-948c-40fb-8349-811c443609d5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 349
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_da0c19e0-4acb-4cef-ba0b-51523b4cbab9"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-2a43e738-63c8-4647-8a96-661f1b7d1483

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2a43e738-63c8-4647-8a96-661f1b7d1483
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a6950e06e379","subject":"Error contract","message":"Hi"}

--- response: 201 in 14 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-2a43e738-63c8-4647-8a96-661f1b7d1483
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
Location: /v1/conversations/cnv_a3978bdc-f9c1-4def-b844-6587f8511e00
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_a3978bdc-f9c1-4def-b844-6587f8511e00","subject":"Error contract","status":"open","region":"eu","participants":["qa-bbc159429617","qa-a6950e06e379"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-22T09:54:42.127011265Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_a3978bdc-f9c1-4def-b844-6587f8511e00/messages
correlation: qa-4516715c-458d-473f-b9f0-9dcabf1391de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4516715c-458d-473f-b9f0-9dcabf1391de
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 6 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4516715c-458d-473f-b9f0-9dcabf1391de
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
Content-Length: 308

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/conversations/cnv_a3978bdc-f9c1-4def-b844-6587f8511e00/messages","correlationId":"qa-4516715c-458d-473f-b9f0-9dcabf1391de"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-a92f244e-4574-4eb8-ba92-2aa97a246b5c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a92f244e-4574-4eb8-ba92-2aa97a246b5c
Content-Type: application/json

--- request body ---
{"handle":"qa-a6950e06e379","password":"****"}

--- response: 200 in 9 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-a92f244e-4574-4eb8-ba92-2aa97a246b5c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 341
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d3606f54-5ed5-4afc-a471-0b7f234a1660"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-02dc4d51-595d-4a16-96c6-12d0220f0f2e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-02dc4d51-595d-4a16-96c6-12d0220f0f2e
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: text/plain
X-Correlation-Id: qa-02dc4d51-595d-4a16-96c6-12d0220f0f2e
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
correlation: qa-d58b6bfd-6230-4089-882f-07e90c1053c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d58b6bfd-6230-4089-882f-07e90c1053c5
Content-Type: application/json

--- request body ---
{"handle":"qa-a6950e06e379","password":"****"}

--- response: 401 in 9 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d58b6bfd-6230-4089-882f-07e90c1053c5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 338
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d58b6bfd-6230-4089-882f-07e90c1053c5"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-906ef5c8-01c6-4f07-b35b-7fc4d92a13e2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-906ef5c8-01c6-4f07-b35b-7fc4d92a13e2
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: text/plain
X-Correlation-Id: qa-906ef5c8-01c6-4f07-b35b-7fc4d92a13e2
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
correlation: qa-5c2fa864-8737-4c13-96e5-70d45dc7a5ce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5c2fa864-8737-4c13-96e5-70d45dc7a5ce
Content-Type: application/json

--- request body ---
{"handle":"qa-bbc159429617","password":"****"}

--- response: 401 in 6 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5c2fa864-8737-4c13-96e5-70d45dc7a5ce
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 336
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5c2fa864-8737-4c13-96e5-70d45dc7a5ce"}
```
