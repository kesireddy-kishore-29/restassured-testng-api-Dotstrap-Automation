# Transcript: Every conversation operation answers an outsider with a 403 problem [POST /v1/conversations/{id}/close]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[4]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 40 | `qa-d7cb3ca3-0c76-4f5c-a342-9c1cb6d268cb` |
| 2 | `POST /v1/accounts` | 201 | 28 | `qa-95e25190-cac4-4650-aa60-ac2b1878c220` |
| 3 | `POST /v1/accounts` | 201 | 38 | `qa-9a6d87c7-4411-4353-97d1-652f36ce8cc5` |
| 4 | `POST /v1/auth/token` | 200 | 24 | `qa-5aacd149-fb84-4518-8ed3-2a840dc47d42` |
| 5 | `POST /v1/conversations` | 201 | 14 | `qa-f8050243-64c6-4dff-908c-b7a083ef1673` |
| 6 | `POST /v1/auth/token` | 200 | 16 | `qa-94bbf0ba-d94e-409d-8e77-8b133239b9e9` |
| 7 | `POST /v1/conversations/{id}/close` | 403 | 15 | `qa-b772ed9f-a044-42f5-9a44-93e8f66a46d9` |
| 8 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-5f5172a9-40db-4aeb-a2ac-66fe335a7e86` |
| 9 | `POST /v1/auth/token` | 401 | 10 | `qa-c24afdf9-5fa6-4b92-88d6-fdb782f4d1b6` |
| 10 | `POST /v1/auth/token` | 200 | 34 | `qa-40edbcc3-4d0b-4315-932a-d90b4acf730d` |
| 11 | `DELETE /v1/accounts/me` | 204 | 54 | `qa-e83df13d-4056-4c16-a8d9-4627d89d428b` |
| 12 | `POST /v1/auth/token` | 401 | 14 | `qa-2d128cba-30af-4688-aa57-06b17c566ada` |
| 13 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-31272f9a-029f-4725-b870-b6d2c72e4474` |
| 14 | `POST /v1/auth/token` | 401 | 23 | `qa-75ed3f11-6212-4fa7-a4d4-33028a8d41e1` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d7cb3ca3-0c76-4f5c-a342-9c1cb6d268cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d7cb3ca3-0c76-4f5c-a342-9c1cb6d268cb
Content-Type: application/json

--- request body ---
{"handle":"qa-ac171e27c8a0","displayName":"QA ac171e27c8a0","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-d7cb3ca3-0c76-4f5c-a342-9c1cb6d268cb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 476
RateLimit-Reset: 9
Location: /v1/accounts/qa-ac171e27c8a0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8282f014-81de-4aab-bb50-856fe48652eb","handle":"qa-ac171e27c8a0","displayName":"QA ac171e27c8a0","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.347049819Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-95e25190-cac4-4650-aa60-ac2b1878c220

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-95e25190-cac4-4650-aa60-ac2b1878c220
Content-Type: application/json

--- request body ---
{"handle":"qa-1f45acfa94d2","displayName":"QA 1f45acfa94d2","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-95e25190-cac4-4650-aa60-ac2b1878c220
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 461
RateLimit-Reset: 9
Location: /v1/accounts/qa-1f45acfa94d2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_853b7080-db1f-449a-abe1-51b4c230101b","handle":"qa-1f45acfa94d2","displayName":"QA 1f45acfa94d2","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.383720234Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-9a6d87c7-4411-4353-97d1-652f36ce8cc5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9a6d87c7-4411-4353-97d1-652f36ce8cc5
Content-Type: application/json

--- request body ---
{"handle":"qa-9b941faa2947","displayName":"QA 9b941faa2947","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-9a6d87c7-4411-4353-97d1-652f36ce8cc5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 453
RateLimit-Reset: 9
Location: /v1/accounts/qa-9b941faa2947
X-Served-Region: eu
Content-Length: 181

{"id":"acc_48dd9705-370b-43a3-a5be-1e007b4d874f","handle":"qa-9b941faa2947","displayName":"QA 9b941faa2947","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.418971278Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-5aacd149-fb84-4518-8ed3-2a840dc47d42

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5aacd149-fb84-4518-8ed3-2a840dc47d42
Content-Type: application/json

--- request body ---
{"handle":"qa-ac171e27c8a0","password":"****"}

--- response: 200 in 24 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-5aacd149-fb84-4518-8ed3-2a840dc47d42
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 448
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8282f014-81de-4aab-bb50-856fe48652eb"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-f8050243-64c6-4dff-908c-b7a083ef1673

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f8050243-64c6-4dff-908c-b7a083ef1673
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-1f45acfa94d2","subject":"Error contract","message":"Hi"}

--- response: 201 in 14 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-f8050243-64c6-4dff-908c-b7a083ef1673
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
Location: /v1/conversations/cnv_9f496f18-567a-4127-8a27-b17607181674
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_9f496f18-567a-4127-8a27-b17607181674","subject":"Error contract","status":"open","region":"eu","participants":["qa-ac171e27c8a0","qa-1f45acfa94d2"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-28T08:42:52.490809930Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-94bbf0ba-d94e-409d-8e77-8b133239b9e9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-94bbf0ba-d94e-409d-8e77-8b133239b9e9
Content-Type: application/json

--- request body ---
{"handle":"qa-9b941faa2947","password":"****"}

--- response: 200 in 16 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-94bbf0ba-d94e-409d-8e77-8b133239b9e9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 443
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_48dd9705-370b-43a3-a5be-1e007b4d874f"}
```

## 7. POST /v1/conversations/{id}/close

```text
#7 POST http://localhost:7070/v1/conversations/cnv_9f496f18-567a-4127-8a27-b17607181674/close
correlation: qa-b772ed9f-a044-42f5-9a44-93e8f66a46d9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b772ed9f-a044-42f5-9a44-93e8f66a46d9
Content-Type: application/json

--- response: 403 in 15 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b772ed9f-a044-42f5-9a44-93e8f66a46d9
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
Content-Length: 291

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_9f496f18-567a-4127-8a27-b17607181674/close","correlationId":"qa-b772ed9f-a044-42f5-9a44-93e8f66a46d9"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5f5172a9-40db-4aeb-a2ac-66fe335a7e86

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5f5172a9-40db-4aeb-a2ac-66fe335a7e86
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5f5172a9-40db-4aeb-a2ac-66fe335a7e86
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

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-c24afdf9-5fa6-4b92-88d6-fdb782f4d1b6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c24afdf9-5fa6-4b92-88d6-fdb782f4d1b6
Content-Type: application/json

--- request body ---
{"handle":"qa-9b941faa2947","password":"****"}

--- response: 401 in 10 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c24afdf9-5fa6-4b92-88d6-fdb782f4d1b6
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c24afdf9-5fa6-4b92-88d6-fdb782f4d1b6"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-40edbcc3-4d0b-4315-932a-d90b4acf730d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-40edbcc3-4d0b-4315-932a-d90b4acf730d
Content-Type: application/json

--- request body ---
{"handle":"qa-1f45acfa94d2","password":"****"}

--- response: 200 in 34 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-40edbcc3-4d0b-4315-932a-d90b4acf730d
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_853b7080-db1f-449a-abe1-51b4c230101b"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e83df13d-4056-4c16-a8d9-4627d89d428b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e83df13d-4056-4c16-a8d9-4627d89d428b
Content-Type: application/json

--- response: 204 in 54 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e83df13d-4056-4c16-a8d9-4627d89d428b
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

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-2d128cba-30af-4688-aa57-06b17c566ada

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d128cba-30af-4688-aa57-06b17c566ada
Content-Type: application/json

--- request body ---
{"handle":"qa-1f45acfa94d2","password":"****"}

--- response: 401 in 14 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2d128cba-30af-4688-aa57-06b17c566ada
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 403
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2d128cba-30af-4688-aa57-06b17c566ada"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-31272f9a-029f-4725-b870-b6d2c72e4474

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-31272f9a-029f-4725-b870-b6d2c72e4474
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-31272f9a-029f-4725-b870-b6d2c72e4474
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

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-75ed3f11-6212-4fa7-a4d4-33028a8d41e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-75ed3f11-6212-4fa7-a4d4-33028a8d41e1
Content-Type: application/json

--- request body ---
{"handle":"qa-ac171e27c8a0","password":"****"}

--- response: 401 in 23 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-75ed3f11-6212-4fa7-a4d4-33028a8d41e1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 394
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-75ed3f11-6212-4fa7-a4d4-33028a8d41e1"}
```
