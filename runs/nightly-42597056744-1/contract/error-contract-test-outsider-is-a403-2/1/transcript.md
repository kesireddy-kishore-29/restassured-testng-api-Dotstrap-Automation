# Transcript: Every conversation operation answers an outsider with a 403 problem [POST /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[2]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 37 | `qa-1e7d12fc-9f94-47d8-a6ad-3c03d9957207` |
| 2 | `POST /v1/accounts` | 201 | 36 | `qa-25eb14a4-791c-415f-aaea-c89cb742f78e` |
| 3 | `POST /v1/accounts` | 201 | 19 | `qa-1e66da66-1934-41f3-927b-cba7c592107f` |
| 4 | `POST /v1/auth/token` | 200 | 28 | `qa-b89e0a7e-9688-4f9b-b0e0-8855a69361f9` |
| 5 | `POST /v1/conversations` | 201 | 18 | `qa-9db9cc7c-64f4-4aee-a696-e6c76a269b50` |
| 6 | `POST /v1/auth/token` | 200 | 11 | `qa-011b0d43-39be-4a26-a65c-99dd51edc89d` |
| 7 | `POST /v1/conversations/{id}/messages` | 403 | 11 | `qa-37cf0412-bc82-4375-80a3-7562ae43edd4` |
| 8 | `DELETE /v1/accounts/me` | 204 | 29 | `qa-cc7ef42e-1f82-4447-b85d-6a8af8434ec3` |
| 9 | `POST /v1/auth/token` | 401 | 17 | `qa-be0e6d8d-09a7-4589-80e7-589829c6dc6c` |
| 10 | `POST /v1/auth/token` | 200 | 19 | `qa-02bb786b-3b72-4bc5-b6c9-a8ae335d555e` |
| 11 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-5da4f0cd-0183-49ac-9d6c-85c648434da0` |
| 12 | `POST /v1/auth/token` | 401 | 16 | `qa-91ed4a8a-a0e4-482a-b88c-1a3f15eca544` |
| 13 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-a2f807e7-31dc-497c-b306-c68141427603` |
| 14 | `POST /v1/auth/token` | 401 | 31 | `qa-e33b0832-ed05-4df5-b1df-2f22eab32ab7` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1e7d12fc-9f94-47d8-a6ad-3c03d9957207

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e7d12fc-9f94-47d8-a6ad-3c03d9957207
Content-Type: application/json

--- request body ---
{"handle":"qa-98d160ceac4f","displayName":"QA 98d160ceac4f","password":"****","region":"eu"}

--- response: 201 in 37 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-1e7d12fc-9f94-47d8-a6ad-3c03d9957207
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 547
RateLimit-Reset: 10
Location: /v1/accounts/qa-98d160ceac4f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_65c9bb1c-c4eb-4899-b507-698d59f5e659","handle":"qa-98d160ceac4f","displayName":"QA 98d160ceac4f","region":"eu","role":"user","createdAt":"2026-11-09T09:56:01.967468395Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-25eb14a4-791c-415f-aaea-c89cb742f78e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-25eb14a4-791c-415f-aaea-c89cb742f78e
Content-Type: application/json

--- request body ---
{"handle":"qa-4da60cab4fbf","displayName":"QA 4da60cab4fbf","password":"****","region":"eu"}

--- response: 201 in 36 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-25eb14a4-791c-415f-aaea-c89cb742f78e
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
Location: /v1/accounts/qa-4da60cab4fbf
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ed6f244f-5137-4a02-8882-1e7b1cb9c7fe","handle":"qa-4da60cab4fbf","displayName":"QA 4da60cab4fbf","region":"eu","role":"user","createdAt":"2026-11-09T09:56:02.020214910Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-1e66da66-1934-41f3-927b-cba7c592107f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e66da66-1934-41f3-927b-cba7c592107f
Content-Type: application/json

--- request body ---
{"handle":"qa-ea6873f2bc00","displayName":"QA ea6873f2bc00","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-1e66da66-1934-41f3-927b-cba7c592107f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 537
RateLimit-Reset: 10
Location: /v1/accounts/qa-ea6873f2bc00
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0903d022-2649-4e47-8a72-318d21976a66","handle":"qa-ea6873f2bc00","displayName":"QA ea6873f2bc00","region":"eu","role":"user","createdAt":"2026-11-09T09:56:02.042815780Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-b89e0a7e-9688-4f9b-b0e0-8855a69361f9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b89e0a7e-9688-4f9b-b0e0-8855a69361f9
Content-Type: application/json

--- request body ---
{"handle":"qa-98d160ceac4f","password":"****"}

--- response: 200 in 28 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-b89e0a7e-9688-4f9b-b0e0-8855a69361f9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 532
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_65c9bb1c-c4eb-4899-b507-698d59f5e659"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-9db9cc7c-64f4-4aee-a696-e6c76a269b50

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9db9cc7c-64f4-4aee-a696-e6c76a269b50
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-4da60cab4fbf","subject":"Error contract","message":"Hi"}

--- response: 201 in 18 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-9db9cc7c-64f4-4aee-a696-e6c76a269b50
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
Location: /v1/conversations/cnv_350b0dde-a2dd-4617-9b17-79c58c11f109
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_350b0dde-a2dd-4617-9b17-79c58c11f109","subject":"Error contract","status":"open","region":"eu","participants":["qa-98d160ceac4f","qa-4da60cab4fbf"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-09T09:56:02.108163800Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-011b0d43-39be-4a26-a65c-99dd51edc89d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-011b0d43-39be-4a26-a65c-99dd51edc89d
Content-Type: application/json

--- request body ---
{"handle":"qa-ea6873f2bc00","password":"****"}

--- response: 200 in 11 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-011b0d43-39be-4a26-a65c-99dd51edc89d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 526
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0903d022-2649-4e47-8a72-318d21976a66"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_350b0dde-a2dd-4617-9b17-79c58c11f109/messages
correlation: qa-37cf0412-bc82-4375-80a3-7562ae43edd4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-37cf0412-bc82-4375-80a3-7562ae43edd4
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 403 in 11 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-37cf0412-bc82-4375-80a3-7562ae43edd4
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
Content-Length: 294

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_350b0dde-a2dd-4617-9b17-79c58c11f109/messages","correlationId":"qa-37cf0412-bc82-4375-80a3-7562ae43edd4"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cc7ef42e-1f82-4447-b85d-6a8af8434ec3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc7ef42e-1f82-4447-b85d-6a8af8434ec3
Content-Type: application/json

--- response: 204 in 29 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cc7ef42e-1f82-4447-b85d-6a8af8434ec3
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
correlation: qa-be0e6d8d-09a7-4589-80e7-589829c6dc6c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-be0e6d8d-09a7-4589-80e7-589829c6dc6c
Content-Type: application/json

--- request body ---
{"handle":"qa-ea6873f2bc00","password":"****"}

--- response: 401 in 17 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-be0e6d8d-09a7-4589-80e7-589829c6dc6c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 507
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-be0e6d8d-09a7-4589-80e7-589829c6dc6c"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-02bb786b-3b72-4bc5-b6c9-a8ae335d555e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-02bb786b-3b72-4bc5-b6c9-a8ae335d555e
Content-Type: application/json

--- request body ---
{"handle":"qa-4da60cab4fbf","password":"****"}

--- response: 200 in 19 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-02bb786b-3b72-4bc5-b6c9-a8ae335d555e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 501
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ed6f244f-5137-4a02-8882-1e7b1cb9c7fe"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5da4f0cd-0183-49ac-9d6c-85c648434da0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5da4f0cd-0183-49ac-9d6c-85c648434da0
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5da4f0cd-0183-49ac-9d6c-85c648434da0
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
correlation: qa-91ed4a8a-a0e4-482a-b88c-1a3f15eca544

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-91ed4a8a-a0e4-482a-b88c-1a3f15eca544
Content-Type: application/json

--- request body ---
{"handle":"qa-4da60cab4fbf","password":"****"}

--- response: 401 in 16 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-91ed4a8a-a0e4-482a-b88c-1a3f15eca544
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 489
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-91ed4a8a-a0e4-482a-b88c-1a3f15eca544"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a2f807e7-31dc-497c-b306-c68141427603

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a2f807e7-31dc-497c-b306-c68141427603
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a2f807e7-31dc-497c-b306-c68141427603
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
correlation: qa-e33b0832-ed05-4df5-b1df-2f22eab32ab7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e33b0832-ed05-4df5-b1df-2f22eab32ab7
Content-Type: application/json

--- request body ---
{"handle":"qa-98d160ceac4f","password":"****"}

--- response: 401 in 31 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e33b0832-ed05-4df5-b1df-2f22eab32ab7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 475
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e33b0832-ed05-4df5-b1df-2f22eab32ab7"}
```
