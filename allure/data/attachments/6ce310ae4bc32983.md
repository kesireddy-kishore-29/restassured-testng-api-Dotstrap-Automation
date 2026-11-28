# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/accounts/me]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[2]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 43 | `qa-947982ab-88bb-4d63-8ec4-54d04be47cec` |
| 2 | `POST /v1/accounts` | 201 | 51 | `qa-74c9ab9d-a6de-4aa7-b0a9-c7c5e1e09a75` |
| 3 | `POST /v1/auth/token` | 200 | 43 | `qa-ee184c25-e5a5-4c48-9c40-9844d260c157` |
| 4 | `POST /v1/conversations` | 201 | 36 | `qa-5899fa60-ca12-4a26-9e59-4a5dbd6813f4` |
| 5 | `GET /v1/accounts/me` | 503 | 39 | `qa-b9f04501-7cb2-4eef-8c05-350d770274ab` |
| 6 | `POST /v1/auth/token` | 200 | 60 | `qa-dd8f6750-0471-407a-bafd-3ae1ce47bbd4` |
| 7 | `DELETE /v1/accounts/me` | 204 | 27 | `qa-802b248f-1665-4d9d-9a5c-a4c5e565d83a` |
| 8 | `POST /v1/auth/token` | 401 | 65 | `qa-d466e342-dd81-449c-8f36-8ace8690518d` |
| 9 | `DELETE /v1/accounts/me` | 204 | 27 | `qa-cb499603-0fe7-4bad-9c2c-d952304acf88` |
| 10 | `POST /v1/auth/token` | 401 | 22 | `qa-8f78271b-bf15-4390-9952-24077294a97b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-947982ab-88bb-4d63-8ec4-54d04be47cec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-947982ab-88bb-4d63-8ec4-54d04be47cec
Content-Type: application/json

--- request body ---
{"handle":"qa-ae31cb267e8a","displayName":"QA ae31cb267e8a","password":"****","region":"eu"}

--- response: 201 in 43 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-947982ab-88bb-4d63-8ec4-54d04be47cec
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 568
RateLimit-Reset: 9
Location: /v1/accounts/qa-ae31cb267e8a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2478bd83-b05c-4a0b-8871-918f11c9f44e","handle":"qa-ae31cb267e8a","displayName":"QA ae31cb267e8a","region":"eu","role":"user","createdAt":"2026-11-28T10:37:22.630279087Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-74c9ab9d-a6de-4aa7-b0a9-c7c5e1e09a75

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-74c9ab9d-a6de-4aa7-b0a9-c7c5e1e09a75
Content-Type: application/json

--- request body ---
{"handle":"qa-3e6912f2a260","displayName":"QA 3e6912f2a260","password":"****","region":"eu"}

--- response: 201 in 51 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-74c9ab9d-a6de-4aa7-b0a9-c7c5e1e09a75
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 556
RateLimit-Reset: 9
Location: /v1/accounts/qa-3e6912f2a260
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1b5877cf-a06f-447b-93a0-a848f82c00de","handle":"qa-3e6912f2a260","displayName":"QA 3e6912f2a260","region":"eu","role":"user","createdAt":"2026-11-28T10:37:22.694039741Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-ee184c25-e5a5-4c48-9c40-9844d260c157

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee184c25-e5a5-4c48-9c40-9844d260c157
Content-Type: application/json

--- request body ---
{"handle":"qa-ae31cb267e8a","password":"****"}

--- response: 200 in 43 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-ee184c25-e5a5-4c48-9c40-9844d260c157
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 544
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2478bd83-b05c-4a0b-8871-918f11c9f44e"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-5899fa60-ca12-4a26-9e59-4a5dbd6813f4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5899fa60-ca12-4a26-9e59-4a5dbd6813f4
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-3e6912f2a260","subject":"Error contract","message":"Hi"}

--- response: 201 in 36 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-5899fa60-ca12-4a26-9e59-4a5dbd6813f4
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
Location: /v1/conversations/cnv_e1d63802-5853-4504-ac72-456960302a64
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_e1d63802-5853-4504-ac72-456960302a64","subject":"Error contract","status":"open","region":"eu","participants":["qa-ae31cb267e8a","qa-3e6912f2a260"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-28T10:37:22.795970653Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-b9f04501-7cb2-4eef-8c05-350d770274ab

--- request headers ---
Accept: application/json
X-Fault-Key: 61673763-e863-40e2-8672-66949553e62c
X-Fault: unavailable-once
X-Correlation-Id: qa-b9f04501-7cb2-4eef-8c05-350d770274ab
Content-Type: application/json

--- response: 503 in 39 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b9f04501-7cb2-4eef-8c05-350d770274ab
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-b9f04501-7cb2-4eef-8c05-350d770274ab"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-dd8f6750-0471-407a-bafd-3ae1ce47bbd4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dd8f6750-0471-407a-bafd-3ae1ce47bbd4
Content-Type: application/json

--- request body ---
{"handle":"qa-3e6912f2a260","password":"****"}

--- response: 200 in 60 ms ---
Date: Sat, 28 Nov 2026 10:37:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-dd8f6750-0471-407a-bafd-3ae1ce47bbd4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 520
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1b5877cf-a06f-447b-93a0-a848f82c00de"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-802b248f-1665-4d9d-9a5c-a4c5e565d83a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-802b248f-1665-4d9d-9a5c-a4c5e565d83a
Content-Type: application/json

--- response: 204 in 27 ms ---
Date: Sat, 28 Nov 2026 10:37:23 GMT
Content-Type: text/plain
X-Correlation-Id: qa-802b248f-1665-4d9d-9a5c-a4c5e565d83a
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
correlation: qa-d466e342-dd81-449c-8f36-8ace8690518d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d466e342-dd81-449c-8f36-8ace8690518d
Content-Type: application/json

--- request body ---
{"handle":"qa-3e6912f2a260","password":"****"}

--- response: 401 in 65 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d466e342-dd81-449c-8f36-8ace8690518d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 500
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d466e342-dd81-449c-8f36-8ace8690518d"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cb499603-0fe7-4bad-9c2c-d952304acf88

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb499603-0fe7-4bad-9c2c-d952304acf88
Content-Type: application/json

--- response: 204 in 27 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cb499603-0fe7-4bad-9c2c-d952304acf88
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
correlation: qa-8f78271b-bf15-4390-9952-24077294a97b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f78271b-bf15-4390-9952-24077294a97b
Content-Type: application/json

--- request body ---
{"handle":"qa-ae31cb267e8a","password":"****"}

--- response: 401 in 22 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8f78271b-bf15-4390-9952-24077294a97b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 489
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8f78271b-bf15-4390-9952-24077294a97b"}
```
