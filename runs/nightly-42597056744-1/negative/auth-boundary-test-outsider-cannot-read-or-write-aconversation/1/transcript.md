# Transcript: Someone outside a conversation gets 403, not its content

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.AuthBoundaryTest#outsiderCannotReadOrWriteAConversation` |
| Features | FEAT-AUTHZ-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 16 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 18 | `qa-5d02dad0-ee74-4fb3-853f-bda9c01198ff` |
| 2 | `POST /v1/accounts` | 201 | 12 | `qa-0d86de93-7de1-4e84-9303-367045d53520` |
| 3 | `POST /v1/accounts` | 201 | 17 | `qa-26cd9804-f0d3-4767-96d0-932b1730df49` |
| 4 | `POST /v1/auth/token` | 200 | 11 | `qa-4520db92-3088-4d9b-a709-0b2614f5cd5d` |
| 5 | `POST /v1/conversations` | 201 | 38 | `qa-fadf2fa8-7790-43b3-80b5-b43952fbeadc` |
| 6 | `POST /v1/auth/token` | 200 | 14 | `qa-b213a65f-ee8c-440f-af3d-bee16251b720` |
| 7 | `GET /v1/conversations/{id}` | 403 | 13 | `qa-5e4b58f0-898a-4edb-a6cc-3c1bde24d1dc` |
| 8 | `GET /v1/conversations/{id}/messages` | 403 | 16 | `qa-95066a1b-3a96-42e4-abc3-206915438202` |
| 9 | `POST /v1/conversations/{id}/messages` | 403 | 10 | `qa-6eb7b0d0-f7c2-4c5c-b815-4af64fed2277` |
| 10 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-9506e1db-a68c-4247-b1c4-aa49eab719f2` |
| 11 | `POST /v1/auth/token` | 401 | 11 | `qa-dea3788a-b0d6-4a37-a225-5965cae2becc` |
| 12 | `POST /v1/auth/token` | 200 | 10 | `qa-5ee5d535-9c5e-4d97-bd8d-d12551adc1b0` |
| 13 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-0071b434-cc76-4256-b5d8-48806d16e0e4` |
| 14 | `POST /v1/auth/token` | 401 | 4 | `qa-b7c58f34-dc1e-41ed-ae1e-e4a578bbb8ab` |
| 15 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-62893b23-3fc1-4fd4-a9ad-13d3e842b9c0` |
| 16 | `POST /v1/auth/token` | 401 | 9 | `qa-e52a6028-90f6-460d-ab18-15779b8cbf1a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5d02dad0-ee74-4fb3-853f-bda9c01198ff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5d02dad0-ee74-4fb3-853f-bda9c01198ff
Content-Type: application/json

--- request body ---
{"handle":"qa-3db3c89bea76","displayName":"QA 3db3c89bea76","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Mon, 09 Nov 2026 09:55:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-5d02dad0-ee74-4fb3-853f-bda9c01198ff
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 584
RateLimit-Reset: 9
Location: /v1/accounts/qa-3db3c89bea76
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b04e8aad-c826-4064-9948-17fcf7b4bb51","handle":"qa-3db3c89bea76","displayName":"QA 3db3c89bea76","region":"eu","role":"user","createdAt":"2026-11-09T09:55:56.725704278Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-0d86de93-7de1-4e84-9303-367045d53520

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d86de93-7de1-4e84-9303-367045d53520
Content-Type: application/json

--- request body ---
{"handle":"qa-a359f2201f24","displayName":"QA a359f2201f24","password":"****","region":"eu"}

--- response: 201 in 12 ms ---
Date: Mon, 09 Nov 2026 09:55:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-0d86de93-7de1-4e84-9303-367045d53520
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 583
RateLimit-Reset: 9
Location: /v1/accounts/qa-a359f2201f24
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0012227b-8c21-414a-81e0-bb8a3c153df2","handle":"qa-a359f2201f24","displayName":"QA a359f2201f24","region":"eu","role":"user","createdAt":"2026-11-09T09:55:56.752454751Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-26cd9804-f0d3-4767-96d0-932b1730df49

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-26cd9804-f0d3-4767-96d0-932b1730df49
Content-Type: application/json

--- request body ---
{"handle":"qa-58da7efc2611","displayName":"QA 58da7efc2611","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Mon, 09 Nov 2026 09:55:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-26cd9804-f0d3-4767-96d0-932b1730df49
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 9
Location: /v1/accounts/qa-58da7efc2611
X-Served-Region: eu
Content-Length: 181

{"id":"acc_72f48162-8fe2-4269-8e19-be12f5a7e07c","handle":"qa-58da7efc2611","displayName":"QA 58da7efc2611","region":"eu","role":"user","createdAt":"2026-11-09T09:55:56.787006574Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-4520db92-3088-4d9b-a709-0b2614f5cd5d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4520db92-3088-4d9b-a709-0b2614f5cd5d
Content-Type: application/json

--- request body ---
{"handle":"qa-3db3c89bea76","password":"****"}

--- response: 200 in 11 ms ---
Date: Mon, 09 Nov 2026 09:55:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-4520db92-3088-4d9b-a709-0b2614f5cd5d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b04e8aad-c826-4064-9948-17fcf7b4bb51"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-fadf2fa8-7790-43b3-80b5-b43952fbeadc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fadf2fa8-7790-43b3-80b5-b43952fbeadc
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a359f2201f24","subject":"Private","message":"Just us"}

--- response: 201 in 38 ms ---
Date: Mon, 09 Nov 2026 09:55:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-fadf2fa8-7790-43b3-80b5-b43952fbeadc
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
Location: /v1/conversations/cnv_0ac3a7a0-6174-4e68-ac91-fb5be5d4c7a5
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_0ac3a7a0-6174-4e68-ac91-fb5be5d4c7a5","subject":"Private","status":"open","region":"eu","participants":["qa-3db3c89bea76","qa-a359f2201f24"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-09T09:55:56.833971375Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-b213a65f-ee8c-440f-af3d-bee16251b720

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b213a65f-ee8c-440f-af3d-bee16251b720
Content-Type: application/json

--- request body ---
{"handle":"qa-58da7efc2611","password":"****"}

--- response: 200 in 14 ms ---
Date: Mon, 09 Nov 2026 09:55:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-b213a65f-ee8c-440f-af3d-bee16251b720
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_72f48162-8fe2-4269-8e19-be12f5a7e07c"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_0ac3a7a0-6174-4e68-ac91-fb5be5d4c7a5
correlation: qa-5e4b58f0-898a-4edb-a6cc-3c1bde24d1dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e4b58f0-898a-4edb-a6cc-3c1bde24d1dc
Content-Type: application/json

--- response: 403 in 13 ms ---
Date: Mon, 09 Nov 2026 09:55:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5e4b58f0-898a-4edb-a6cc-3c1bde24d1dc
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
Content-Length: 285

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_0ac3a7a0-6174-4e68-ac91-fb5be5d4c7a5","correlationId":"qa-5e4b58f0-898a-4edb-a6cc-3c1bde24d1dc"}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_0ac3a7a0-6174-4e68-ac91-fb5be5d4c7a5/messages
correlation: qa-95066a1b-3a96-42e4-abc3-206915438202

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-95066a1b-3a96-42e4-abc3-206915438202
Content-Type: application/json

--- response: 403 in 16 ms ---
Date: Mon, 09 Nov 2026 09:55:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-95066a1b-3a96-42e4-abc3-206915438202
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
Content-Length: 294

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_0ac3a7a0-6174-4e68-ac91-fb5be5d4c7a5/messages","correlationId":"qa-95066a1b-3a96-42e4-abc3-206915438202"}
```

## 9. POST /v1/conversations/{id}/messages

```text
#9 POST http://localhost:7070/v1/conversations/cnv_0ac3a7a0-6174-4e68-ac91-fb5be5d4c7a5/messages
correlation: qa-6eb7b0d0-f7c2-4c5c-b815-4af64fed2277

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6eb7b0d0-f7c2-4c5c-b815-4af64fed2277
Content-Type: application/json

--- request body ---
{"body":"Let me in"}

--- response: 403 in 10 ms ---
Date: Mon, 09 Nov 2026 09:55:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6eb7b0d0-f7c2-4c5c-b815-4af64fed2277
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
Content-Length: 294

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_0ac3a7a0-6174-4e68-ac91-fb5be5d4c7a5/messages","correlationId":"qa-6eb7b0d0-f7c2-4c5c-b815-4af64fed2277"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9506e1db-a68c-4247-b1c4-aa49eab719f2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9506e1db-a68c-4247-b1c4-aa49eab719f2
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Mon, 09 Nov 2026 09:55:57 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9506e1db-a68c-4247-b1c4-aa49eab719f2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: eu
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-dea3788a-b0d6-4a37-a225-5965cae2becc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dea3788a-b0d6-4a37-a225-5965cae2becc
Content-Type: application/json

--- request body ---
{"handle":"qa-58da7efc2611","password":"****"}

--- response: 401 in 11 ms ---
Date: Mon, 09 Nov 2026 09:55:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dea3788a-b0d6-4a37-a225-5965cae2becc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 571
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-dea3788a-b0d6-4a37-a225-5965cae2becc"}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-5ee5d535-9c5e-4d97-bd8d-d12551adc1b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5ee5d535-9c5e-4d97-bd8d-d12551adc1b0
Content-Type: application/json

--- request body ---
{"handle":"qa-a359f2201f24","password":"****"}

--- response: 200 in 10 ms ---
Date: Mon, 09 Nov 2026 09:55:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-5ee5d535-9c5e-4d97-bd8d-d12551adc1b0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 570
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0012227b-8c21-414a-81e0-bb8a3c153df2"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0071b434-cc76-4256-b5d8-48806d16e0e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0071b434-cc76-4256-b5d8-48806d16e0e4
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Mon, 09 Nov 2026 09:55:57 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0071b434-cc76-4256-b5d8-48806d16e0e4
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

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-b7c58f34-dc1e-41ed-ae1e-e4a578bbb8ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b7c58f34-dc1e-41ed-ae1e-e4a578bbb8ab
Content-Type: application/json

--- request body ---
{"handle":"qa-a359f2201f24","password":"****"}

--- response: 401 in 4 ms ---
Date: Mon, 09 Nov 2026 09:55:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b7c58f34-dc1e-41ed-ae1e-e4a578bbb8ab
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b7c58f34-dc1e-41ed-ae1e-e4a578bbb8ab"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-62893b23-3fc1-4fd4-a9ad-13d3e842b9c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-62893b23-3fc1-4fd4-a9ad-13d3e842b9c0
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Mon, 09 Nov 2026 09:55:57 GMT
Content-Type: text/plain
X-Correlation-Id: qa-62893b23-3fc1-4fd4-a9ad-13d3e842b9c0
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

## 16. POST /v1/auth/token

```text
#16 POST http://localhost:7070/v1/auth/token
correlation: qa-e52a6028-90f6-460d-ab18-15779b8cbf1a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e52a6028-90f6-460d-ab18-15779b8cbf1a
Content-Type: application/json

--- request body ---
{"handle":"qa-3db3c89bea76","password":"****"}

--- response: 401 in 9 ms ---
Date: Mon, 09 Nov 2026 09:55:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e52a6028-90f6-460d-ab18-15779b8cbf1a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 567
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e52a6028-90f6-460d-ab18-15779b8cbf1a"}
```
