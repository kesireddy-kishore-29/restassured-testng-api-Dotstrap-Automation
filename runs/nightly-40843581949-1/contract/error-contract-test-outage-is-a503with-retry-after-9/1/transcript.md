# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[9]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 34 | `qa-2e6103cc-1869-4a0e-a4cc-e504dc8465f6` |
| 2 | `POST /v1/accounts` | 201 | 36 | `qa-b46a3ae3-ce35-48c7-b8cb-a82e1fb373ec` |
| 3 | `POST /v1/auth/token` | 200 | 44 | `qa-300e2aed-3ed2-43be-9b09-7c3f1b9a3dc8` |
| 4 | `POST /v1/conversations` | 201 | 20 | `qa-e0c50b7a-aab7-49f0-a8ca-a0e8928c2a18` |
| 5 | `GET /v1/conversations/{id}/messages` | 503 | 18 | `qa-a51d0f85-dc1d-40a6-a0e0-1c68d9791321` |
| 6 | `POST /v1/auth/token` | 200 | 38 | `qa-b0bb6d45-13f9-40fb-b040-1ccec382da82` |
| 7 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-4cb824de-b629-4c02-95ef-60e9c0c11ddf` |
| 8 | `POST /v1/auth/token` | 401 | 17 | `qa-2d7bac86-21dc-46c1-817c-4e248b8253c7` |
| 9 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-4058e9ee-bbd7-46ff-b58e-cc44cd2ab172` |
| 10 | `POST /v1/auth/token` | 401 | 10 | `qa-50df9131-6576-4f98-92cf-515fceb7d110` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2e6103cc-1869-4a0e-a4cc-e504dc8465f6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e6103cc-1869-4a0e-a4cc-e504dc8465f6
Content-Type: application/json

--- request body ---
{"handle":"qa-866eb0e210b8","displayName":"QA 866eb0e210b8","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-2e6103cc-1869-4a0e-a4cc-e504dc8465f6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 435
RateLimit-Reset: 8
Location: /v1/accounts/qa-866eb0e210b8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e8ffc6cb-b5f0-442f-bcde-c6adc5992309","handle":"qa-866eb0e210b8","displayName":"QA 866eb0e210b8","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.442493215Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-b46a3ae3-ce35-48c7-b8cb-a82e1fb373ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b46a3ae3-ce35-48c7-b8cb-a82e1fb373ec
Content-Type: application/json

--- request body ---
{"handle":"qa-820a28024ef5","displayName":"QA 820a28024ef5","password":"****","region":"eu"}

--- response: 201 in 36 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-b46a3ae3-ce35-48c7-b8cb-a82e1fb373ec
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 428
RateLimit-Reset: 8
Location: /v1/accounts/qa-820a28024ef5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_877ceb10-7fb7-43de-baf4-4a4f21b5b511","handle":"qa-820a28024ef5","displayName":"QA 820a28024ef5","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.488122973Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-300e2aed-3ed2-43be-9b09-7c3f1b9a3dc8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-300e2aed-3ed2-43be-9b09-7c3f1b9a3dc8
Content-Type: application/json

--- request body ---
{"handle":"qa-866eb0e210b8","password":"****"}

--- response: 200 in 44 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-300e2aed-3ed2-43be-9b09-7c3f1b9a3dc8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 420
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e8ffc6cb-b5f0-442f-bcde-c6adc5992309"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-e0c50b7a-aab7-49f0-a8ca-a0e8928c2a18

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e0c50b7a-aab7-49f0-a8ca-a0e8928c2a18
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-820a28024ef5","subject":"Error contract","message":"Hi"}

--- response: 201 in 20 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-e0c50b7a-aab7-49f0-a8ca-a0e8928c2a18
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
Location: /v1/conversations/cnv_a750d2d9-483e-411e-aa33-4be0b29e464b
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_a750d2d9-483e-411e-aa33-4be0b29e464b","subject":"Error contract","status":"open","region":"eu","participants":["qa-866eb0e210b8","qa-820a28024ef5"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-29T08:39:00.590572806Z"}
```

## 5. GET /v1/conversations/{id}/messages

```text
#5 GET http://localhost:7070/v1/conversations/cnv_a750d2d9-483e-411e-aa33-4be0b29e464b/messages
correlation: qa-a51d0f85-dc1d-40a6-a0e0-1c68d9791321

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 7bdfcdc4-25ba-46a4-9c2d-77752aaf7a43
X-Correlation-Id: qa-a51d0f85-dc1d-40a6-a0e0-1c68d9791321
Content-Type: application/json

--- response: 503 in 18 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a51d0f85-dc1d-40a6-a0e0-1c68d9791321
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 311

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_a750d2d9-483e-411e-aa33-4be0b29e464b/messages","correlationId":"qa-a51d0f85-dc1d-40a6-a0e0-1c68d9791321"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-b0bb6d45-13f9-40fb-b040-1ccec382da82

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b0bb6d45-13f9-40fb-b040-1ccec382da82
Content-Type: application/json

--- request body ---
{"handle":"qa-820a28024ef5","password":"****"}

--- response: 200 in 38 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-b0bb6d45-13f9-40fb-b040-1ccec382da82
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 403
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_877ceb10-7fb7-43de-baf4-4a4f21b5b511"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4cb824de-b629-4c02-95ef-60e9c0c11ddf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4cb824de-b629-4c02-95ef-60e9c0c11ddf
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4cb824de-b629-4c02-95ef-60e9c0c11ddf
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
correlation: qa-2d7bac86-21dc-46c1-817c-4e248b8253c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d7bac86-21dc-46c1-817c-4e248b8253c7
Content-Type: application/json

--- request body ---
{"handle":"qa-820a28024ef5","password":"****"}

--- response: 401 in 17 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2d7bac86-21dc-46c1-817c-4e248b8253c7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 396
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2d7bac86-21dc-46c1-817c-4e248b8253c7"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4058e9ee-bbd7-46ff-b58e-cc44cd2ab172

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4058e9ee-bbd7-46ff-b58e-cc44cd2ab172
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4058e9ee-bbd7-46ff-b58e-cc44cd2ab172
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
correlation: qa-50df9131-6576-4f98-92cf-515fceb7d110

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-50df9131-6576-4f98-92cf-515fceb7d110
Content-Type: application/json

--- request body ---
{"handle":"qa-866eb0e210b8","password":"****"}

--- response: 401 in 10 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-50df9131-6576-4f98-92cf-515fceb7d110
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 389
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-50df9131-6576-4f98-92cf-515fceb7d110"}
```
