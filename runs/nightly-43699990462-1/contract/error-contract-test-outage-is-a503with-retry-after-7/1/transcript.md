# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/conversations]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[7]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 25 | `qa-b502a517-7edd-46db-bd53-57b57504dbe9` |
| 2 | `POST /v1/accounts` | 201 | 25 | `qa-fed55408-68a1-408e-908b-115942c5879a` |
| 3 | `POST /v1/auth/token` | 200 | 26 | `qa-4b4d26a0-6381-4160-8f85-7ff3e23dd95f` |
| 4 | `POST /v1/conversations` | 201 | 8 | `qa-e446e8ad-2dfe-4dc6-b8bb-62f0d6a35802` |
| 5 | `GET /v1/conversations` | 503 | 10 | `qa-7035b2bd-b8d9-41cd-8952-5217a70fcc07` |
| 6 | `POST /v1/auth/token` | 200 | 24 | `qa-acdb3c91-4a73-41ca-9a26-c435a001c24d` |
| 7 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-0ad3f625-1bcf-4037-827c-ce02ec6eeb62` |
| 8 | `POST /v1/auth/token` | 401 | 15 | `qa-01ae916d-48e8-41a2-b2b4-694924886d39` |
| 9 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-8c72ff68-22c9-4742-8d5c-bcd20caa182a` |
| 10 | `POST /v1/auth/token` | 401 | 11 | `qa-aff6b2af-6910-45c3-b603-b2fc71cf14bf` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b502a517-7edd-46db-bd53-57b57504dbe9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b502a517-7edd-46db-bd53-57b57504dbe9
Content-Type: application/json

--- request body ---
{"handle":"qa-29c8420471ec","displayName":"QA 29c8420471ec","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-b502a517-7edd-46db-bd53-57b57504dbe9
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
Location: /v1/accounts/qa-29c8420471ec
X-Served-Region: eu
Content-Length: 181

{"id":"acc_973b3d54-2967-4948-a594-0a392af56522","handle":"qa-29c8420471ec","displayName":"QA 29c8420471ec","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.465675678Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-fed55408-68a1-408e-908b-115942c5879a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fed55408-68a1-408e-908b-115942c5879a
Content-Type: application/json

--- request body ---
{"handle":"qa-16cfc98ea1d0","displayName":"QA 16cfc98ea1d0","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-fed55408-68a1-408e-908b-115942c5879a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 458
RateLimit-Reset: 8
Location: /v1/accounts/qa-16cfc98ea1d0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5d2e35a5-19c5-4864-b65c-9b453fd2b9a1","handle":"qa-16cfc98ea1d0","displayName":"QA 16cfc98ea1d0","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.526051526Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-4b4d26a0-6381-4160-8f85-7ff3e23dd95f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4b4d26a0-6381-4160-8f85-7ff3e23dd95f
Content-Type: application/json

--- request body ---
{"handle":"qa-29c8420471ec","password":"****"}

--- response: 200 in 26 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-4b4d26a0-6381-4160-8f85-7ff3e23dd95f
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_973b3d54-2967-4948-a594-0a392af56522"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-e446e8ad-2dfe-4dc6-b8bb-62f0d6a35802

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e446e8ad-2dfe-4dc6-b8bb-62f0d6a35802
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-16cfc98ea1d0","subject":"Error contract","message":"Hi"}

--- response: 201 in 8 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-e446e8ad-2dfe-4dc6-b8bb-62f0d6a35802
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
Location: /v1/conversations/cnv_55bc8b8b-19b0-4438-bc0f-d1e4f6792666
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_55bc8b8b-19b0-4438-bc0f-d1e4f6792666","subject":"Error contract","status":"open","region":"eu","participants":["qa-29c8420471ec","qa-16cfc98ea1d0"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-15T09:36:09.583370786Z"}
```

## 5. GET /v1/conversations

```text
#5 GET http://localhost:7070/v1/conversations
correlation: qa-7035b2bd-b8d9-41cd-8952-5217a70fcc07

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 2f95a178-686c-40dc-861b-a91974496982
X-Correlation-Id: qa-7035b2bd-b8d9-41cd-8952-5217a70fcc07
Content-Type: application/json

--- response: 503 in 10 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7035b2bd-b8d9-41cd-8952-5217a70fcc07
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 261

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations","correlationId":"qa-7035b2bd-b8d9-41cd-8952-5217a70fcc07"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-acdb3c91-4a73-41ca-9a26-c435a001c24d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-acdb3c91-4a73-41ca-9a26-c435a001c24d
Content-Type: application/json

--- request body ---
{"handle":"qa-16cfc98ea1d0","password":"****"}

--- response: 200 in 24 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-acdb3c91-4a73-41ca-9a26-c435a001c24d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 426
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5d2e35a5-19c5-4864-b65c-9b453fd2b9a1"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0ad3f625-1bcf-4037-827c-ce02ec6eeb62

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ad3f625-1bcf-4037-827c-ce02ec6eeb62
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0ad3f625-1bcf-4037-827c-ce02ec6eeb62
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
correlation: qa-01ae916d-48e8-41a2-b2b4-694924886d39

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-01ae916d-48e8-41a2-b2b4-694924886d39
Content-Type: application/json

--- request body ---
{"handle":"qa-16cfc98ea1d0","password":"****"}

--- response: 401 in 15 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-01ae916d-48e8-41a2-b2b4-694924886d39
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 413
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-01ae916d-48e8-41a2-b2b4-694924886d39"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8c72ff68-22c9-4742-8d5c-bcd20caa182a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c72ff68-22c9-4742-8d5c-bcd20caa182a
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8c72ff68-22c9-4742-8d5c-bcd20caa182a
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
correlation: qa-aff6b2af-6910-45c3-b603-b2fc71cf14bf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aff6b2af-6910-45c3-b603-b2fc71cf14bf
Content-Type: application/json

--- request body ---
{"handle":"qa-29c8420471ec","password":"****"}

--- response: 401 in 11 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-aff6b2af-6910-45c3-b603-b2fc71cf14bf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 406
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-aff6b2af-6910-45c3-b603-b2fc71cf14bf"}
```
