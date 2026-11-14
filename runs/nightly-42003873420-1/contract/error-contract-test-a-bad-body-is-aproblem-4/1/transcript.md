# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/accounts, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[4]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 46 | `qa-c17a8153-999f-4708-9388-b750efa8341e` |
| 2 | `POST /v1/accounts` | 201 | 95 | `qa-ffe6e701-cfb9-42f6-9df5-bbedb7890da6` |
| 3 | `POST /v1/auth/token` | 200 | 37 | `qa-1896223c-6b78-48c3-88ee-3917f6ea20f8` |
| 4 | `POST /v1/conversations` | 201 | 26 | `qa-db73b935-5ce8-446c-b385-1adc3623ad5a` |
| 5 | `POST /v1/accounts` | 415 | 12 | `qa-302d4feb-75a9-4e64-b141-9b5dc3f85e5a` |
| 6 | `POST /v1/auth/token` | 200 | 22 | `qa-c5b96b64-266a-405e-9502-94ae9a1bfcbe` |
| 7 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-af44112c-469a-4a84-a4c4-f680f2278da4` |
| 8 | `POST /v1/auth/token` | 401 | 28 | `qa-90627c3d-0ee6-4c78-a1ef-ff20bcbcf183` |
| 9 | `DELETE /v1/accounts/me` | 204 | 29 | `qa-c8b369e3-47e5-42a0-97cb-bc32ac289b3b` |
| 10 | `POST /v1/auth/token` | 401 | 19 | `qa-d17b4072-7cc6-46de-8234-c5ff178bfb2d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c17a8153-999f-4708-9388-b750efa8341e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c17a8153-999f-4708-9388-b750efa8341e
Content-Type: application/json

--- request body ---
{"handle":"qa-b1adc85919b4","displayName":"QA b1adc85919b4","password":"****","region":"eu"}

--- response: 201 in 46 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-c17a8153-999f-4708-9388-b750efa8341e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 476
RateLimit-Reset: 8
Location: /v1/accounts/qa-b1adc85919b4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_37ee00ae-0c12-4dd0-abab-2f71850866b6","handle":"qa-b1adc85919b4","displayName":"QA b1adc85919b4","region":"eu","role":"user","createdAt":"2026-11-05T09:37:55.501724360Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-ffe6e701-cfb9-42f6-9df5-bbedb7890da6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ffe6e701-cfb9-42f6-9df5-bbedb7890da6
Content-Type: application/json

--- request body ---
{"handle":"qa-67a78dedf03d","displayName":"QA 67a78dedf03d","password":"****","region":"eu"}

--- response: 201 in 95 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-ffe6e701-cfb9-42f6-9df5-bbedb7890da6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 461
RateLimit-Reset: 7
Location: /v1/accounts/qa-67a78dedf03d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9ef761e4-2f44-41d6-9bd0-272234efc662","handle":"qa-67a78dedf03d","displayName":"QA 67a78dedf03d","region":"eu","role":"user","createdAt":"2026-11-05T09:37:55.616480025Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-1896223c-6b78-48c3-88ee-3917f6ea20f8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1896223c-6b78-48c3-88ee-3917f6ea20f8
Content-Type: application/json

--- request body ---
{"handle":"qa-b1adc85919b4","password":"****"}

--- response: 200 in 37 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-1896223c-6b78-48c3-88ee-3917f6ea20f8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 451
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_37ee00ae-0c12-4dd0-abab-2f71850866b6"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-db73b935-5ce8-446c-b385-1adc3623ad5a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db73b935-5ce8-446c-b385-1adc3623ad5a
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-67a78dedf03d","subject":"Error contract","message":"Hi"}

--- response: 201 in 26 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-db73b935-5ce8-446c-b385-1adc3623ad5a
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
Location: /v1/conversations/cnv_e88179ca-e03b-4588-9fa5-d4bb80be8d85
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_e88179ca-e03b-4588-9fa5-d4bb80be8d85","subject":"Error contract","status":"open","region":"eu","participants":["qa-b1adc85919b4","qa-67a78dedf03d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-05T09:37:55.709818526Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-302d4feb-75a9-4e64-b141-9b5dc3f85e5a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-302d4feb-75a9-4e64-b141-9b5dc3f85e5a
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 12 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-302d4feb-75a9-4e64-b141-9b5dc3f85e5a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 444
RateLimit-Reset: 7
Content-Length: 252

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/accounts","correlationId":"qa-302d4feb-75a9-4e64-b141-9b5dc3f85e5a"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-c5b96b64-266a-405e-9502-94ae9a1bfcbe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c5b96b64-266a-405e-9502-94ae9a1bfcbe
Content-Type: application/json

--- request body ---
{"handle":"qa-67a78dedf03d","password":"****"}

--- response: 200 in 22 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-c5b96b64-266a-405e-9502-94ae9a1bfcbe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 432
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9ef761e4-2f44-41d6-9bd0-272234efc662"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-af44112c-469a-4a84-a4c4-f680f2278da4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-af44112c-469a-4a84-a4c4-f680f2278da4
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-af44112c-469a-4a84-a4c4-f680f2278da4
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
correlation: qa-90627c3d-0ee6-4c78-a1ef-ff20bcbcf183

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-90627c3d-0ee6-4c78-a1ef-ff20bcbcf183
Content-Type: application/json

--- request body ---
{"handle":"qa-67a78dedf03d","password":"****"}

--- response: 401 in 28 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-90627c3d-0ee6-4c78-a1ef-ff20bcbcf183
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 424
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-90627c3d-0ee6-4c78-a1ef-ff20bcbcf183"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c8b369e3-47e5-42a0-97cb-bc32ac289b3b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c8b369e3-47e5-42a0-97cb-bc32ac289b3b
Content-Type: application/json

--- response: 204 in 29 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c8b369e3-47e5-42a0-97cb-bc32ac289b3b
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
correlation: qa-d17b4072-7cc6-46de-8234-c5ff178bfb2d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d17b4072-7cc6-46de-8234-c5ff178bfb2d
Content-Type: application/json

--- request body ---
{"handle":"qa-b1adc85919b4","password":"****"}

--- response: 401 in 19 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d17b4072-7cc6-46de-8234-c5ff178bfb2d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 411
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d17b4072-7cc6-46de-8234-c5ff178bfb2d"}
```
