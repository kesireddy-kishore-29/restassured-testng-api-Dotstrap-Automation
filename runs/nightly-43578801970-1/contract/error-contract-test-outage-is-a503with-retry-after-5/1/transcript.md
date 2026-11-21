# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/accounts/{handle}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[5]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 42 | `qa-8f2591ef-10a4-4cb3-a31b-7dbb5b476139` |
| 2 | `POST /v1/accounts` | 201 | 29 | `qa-847861f8-0173-4e09-8287-5bf7bfda2826` |
| 3 | `POST /v1/auth/token` | 200 | 22 | `qa-05d752df-04ab-4644-abf1-ad8bd7052d54` |
| 4 | `POST /v1/conversations` | 201 | 19 | `qa-f8e3777d-3a83-4f15-82ef-4e388c75a617` |
| 5 | `GET /v1/accounts/{handle}` | 503 | 26 | `qa-771f4b23-8178-493a-a135-642ac49c9248` |
| 6 | `POST /v1/auth/token` | 200 | 29 | `qa-f186c707-b6d8-4d70-8feb-ec161b149328` |
| 7 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-3bda7d54-a2fb-45b6-a226-ec4079edd969` |
| 8 | `POST /v1/auth/token` | 401 | 21 | `qa-58a7b1b3-39ae-424e-b2e0-f24b537c5ad0` |
| 9 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-c8c2b0d4-b0b6-45f1-a468-c6354e4f74b0` |
| 10 | `POST /v1/auth/token` | 401 | 19 | `qa-0f181bc3-4605-475b-ae6a-014e7f47a3e4` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8f2591ef-10a4-4cb3-a31b-7dbb5b476139

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f2591ef-10a4-4cb3-a31b-7dbb5b476139
Content-Type: application/json

--- request body ---
{"handle":"qa-969c9ba59a28","displayName":"QA 969c9ba59a28","password":"****","region":"eu"}

--- response: 201 in 42 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-8f2591ef-10a4-4cb3-a31b-7dbb5b476139
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 471
RateLimit-Reset: 8
Location: /v1/accounts/qa-969c9ba59a28
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e6277557-af7b-4242-982f-cce854a86915","handle":"qa-969c9ba59a28","displayName":"QA 969c9ba59a28","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.415415713Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-847861f8-0173-4e09-8287-5bf7bfda2826

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-847861f8-0173-4e09-8287-5bf7bfda2826
Content-Type: application/json

--- request body ---
{"handle":"qa-885fc0d560fb","displayName":"QA 885fc0d560fb","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-847861f8-0173-4e09-8287-5bf7bfda2826
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 456
RateLimit-Reset: 8
Location: /v1/accounts/qa-885fc0d560fb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4c93992e-0c54-4c44-b927-739fd73701c9","handle":"qa-885fc0d560fb","displayName":"QA 885fc0d560fb","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.510396415Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-05d752df-04ab-4644-abf1-ad8bd7052d54

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-05d752df-04ab-4644-abf1-ad8bd7052d54
Content-Type: application/json

--- request body ---
{"handle":"qa-969c9ba59a28","password":"****"}

--- response: 200 in 22 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-05d752df-04ab-4644-abf1-ad8bd7052d54
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 449
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e6277557-af7b-4242-982f-cce854a86915"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-f8e3777d-3a83-4f15-82ef-4e388c75a617

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f8e3777d-3a83-4f15-82ef-4e388c75a617
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-885fc0d560fb","subject":"Error contract","message":"Hi"}

--- response: 201 in 19 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-f8e3777d-3a83-4f15-82ef-4e388c75a617
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
Location: /v1/conversations/cnv_e8cd3e96-ba71-4e29-a860-ecf8d09472ca
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_e8cd3e96-ba71-4e29-a860-ecf8d09472ca","subject":"Error contract","status":"open","region":"eu","participants":["qa-969c9ba59a28","qa-885fc0d560fb"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-14T09:05:11.571260141Z"}
```

## 5. GET /v1/accounts/{handle}

```text
#5 GET http://localhost:7070/v1/accounts/qa-969c9ba59a28
correlation: qa-771f4b23-8178-493a-a135-642ac49c9248

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 1366ff3d-1e53-4080-a423-d16623e71bac
X-Correlation-Id: qa-771f4b23-8178-493a-a135-642ac49c9248
Content-Type: application/json

--- response: 503 in 26 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-771f4b23-8178-493a-a135-642ac49c9248
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 272

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/qa-969c9ba59a28","correlationId":"qa-771f4b23-8178-493a-a135-642ac49c9248"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-f186c707-b6d8-4d70-8feb-ec161b149328

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f186c707-b6d8-4d70-8feb-ec161b149328
Content-Type: application/json

--- request body ---
{"handle":"qa-885fc0d560fb","password":"****"}

--- response: 200 in 29 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-f186c707-b6d8-4d70-8feb-ec161b149328
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 434
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4c93992e-0c54-4c44-b927-739fd73701c9"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3bda7d54-a2fb-45b6-a226-ec4079edd969

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3bda7d54-a2fb-45b6-a226-ec4079edd969
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3bda7d54-a2fb-45b6-a226-ec4079edd969
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
correlation: qa-58a7b1b3-39ae-424e-b2e0-f24b537c5ad0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-58a7b1b3-39ae-424e-b2e0-f24b537c5ad0
Content-Type: application/json

--- request body ---
{"handle":"qa-885fc0d560fb","password":"****"}

--- response: 401 in 21 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-58a7b1b3-39ae-424e-b2e0-f24b537c5ad0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 424
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-58a7b1b3-39ae-424e-b2e0-f24b537c5ad0"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c8c2b0d4-b0b6-45f1-a468-c6354e4f74b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c8c2b0d4-b0b6-45f1-a468-c6354e4f74b0
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c8c2b0d4-b0b6-45f1-a468-c6354e4f74b0
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
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-0f181bc3-4605-475b-ae6a-014e7f47a3e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f181bc3-4605-475b-ae6a-014e7f47a3e4
Content-Type: application/json

--- request body ---
{"handle":"qa-969c9ba59a28","password":"****"}

--- response: 401 in 19 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0f181bc3-4605-475b-ae6a-014e7f47a3e4
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0f181bc3-4605-475b-ae6a-014e7f47a3e4"}
```
