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
| 1 | `POST /v1/accounts` | 201 | 30 | `qa-3650ee81-f2d8-42aa-9b2e-35f067ee3559` |
| 2 | `POST /v1/accounts` | 201 | 31 | `qa-898092ec-617d-4c4e-94ba-d6f1bf47e74e` |
| 3 | `POST /v1/auth/token` | 200 | 30 | `qa-d74109a9-a3e1-496e-bdb4-12cfe90f5bea` |
| 4 | `POST /v1/conversations` | 201 | 23 | `qa-fc8f0ce7-f169-45ca-b2ac-97d5d9ae2faa` |
| 5 | `POST /v1/conversations/{id}/messages` | 400 | 14 | `qa-8b4c55c6-5b3a-4b1f-a86a-24d7be55be4c` |
| 6 | `POST /v1/auth/token` | 200 | 35 | `qa-adab7365-38fd-4911-868f-5c66afec17a1` |
| 7 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-a5a1ae4e-6a9d-458c-b7c7-6091e8f44a6c` |
| 8 | `POST /v1/auth/token` | 401 | 8 | `qa-227bb245-b0b5-451b-8eb2-ecd30b4e286e` |
| 9 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-0d1f6517-897a-4091-b5b8-2da8d8e37361` |
| 10 | `POST /v1/auth/token` | 401 | 11 | `qa-982b4098-4a43-48f0-834d-a03fbc2a2bbd` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3650ee81-f2d8-42aa-9b2e-35f067ee3559

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3650ee81-f2d8-42aa-9b2e-35f067ee3559
Content-Type: application/json

--- request body ---
{"handle":"qa-1e87ca3f41cb","displayName":"QA 1e87ca3f41cb","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-3650ee81-f2d8-42aa-9b2e-35f067ee3559
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 389
RateLimit-Reset: 8
Location: /v1/accounts/qa-1e87ca3f41cb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_43b8eed7-5c84-44a1-8b2f-289bc6ddd2b3","handle":"qa-1e87ca3f41cb","displayName":"QA 1e87ca3f41cb","region":"eu","role":"user","createdAt":"2026-11-02T09:38:37.157007254Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-898092ec-617d-4c4e-94ba-d6f1bf47e74e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-898092ec-617d-4c4e-94ba-d6f1bf47e74e
Content-Type: application/json

--- request body ---
{"handle":"qa-45984eb00841","displayName":"QA 45984eb00841","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-898092ec-617d-4c4e-94ba-d6f1bf47e74e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 383
RateLimit-Reset: 8
Location: /v1/accounts/qa-45984eb00841
X-Served-Region: eu
Content-Length: 181

{"id":"acc_74663b6a-3c59-44b1-a5ea-6ecd9cf0cd59","handle":"qa-45984eb00841","displayName":"QA 45984eb00841","region":"eu","role":"user","createdAt":"2026-11-02T09:38:37.193304039Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-d74109a9-a3e1-496e-bdb4-12cfe90f5bea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d74109a9-a3e1-496e-bdb4-12cfe90f5bea
Content-Type: application/json

--- request body ---
{"handle":"qa-1e87ca3f41cb","password":"****"}

--- response: 200 in 30 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-d74109a9-a3e1-496e-bdb4-12cfe90f5bea
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 375
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_43b8eed7-5c84-44a1-8b2f-289bc6ddd2b3"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-fc8f0ce7-f169-45ca-b2ac-97d5d9ae2faa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc8f0ce7-f169-45ca-b2ac-97d5d9ae2faa
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-45984eb00841","subject":"Error contract","message":"Hi"}

--- response: 201 in 23 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-fc8f0ce7-f169-45ca-b2ac-97d5d9ae2faa
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
Location: /v1/conversations/cnv_3e6f244f-edca-4a0a-8c82-61bd3a74896a
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_3e6f244f-edca-4a0a-8c82-61bd3a74896a","subject":"Error contract","status":"open","region":"eu","participants":["qa-1e87ca3f41cb","qa-45984eb00841"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-02T09:38:37.258227245Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_3e6f244f-edca-4a0a-8c82-61bd3a74896a/messages
correlation: qa-8b4c55c6-5b3a-4b1f-a86a-24d7be55be4c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b4c55c6-5b3a-4b1f-a86a-24d7be55be4c
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 14 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8b4c55c6-5b3a-4b1f-a86a-24d7be55be4c
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

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/conversations/cnv_3e6f244f-edca-4a0a-8c82-61bd3a74896a/messages","correlationId":"qa-8b4c55c6-5b3a-4b1f-a86a-24d7be55be4c"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-adab7365-38fd-4911-868f-5c66afec17a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-adab7365-38fd-4911-868f-5c66afec17a1
Content-Type: application/json

--- request body ---
{"handle":"qa-45984eb00841","password":"****"}

--- response: 200 in 35 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-adab7365-38fd-4911-868f-5c66afec17a1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 364
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_74663b6a-3c59-44b1-a5ea-6ecd9cf0cd59"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a5a1ae4e-6a9d-458c-b7c7-6091e8f44a6c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a5a1ae4e-6a9d-458c-b7c7-6091e8f44a6c
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a5a1ae4e-6a9d-458c-b7c7-6091e8f44a6c
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
correlation: qa-227bb245-b0b5-451b-8eb2-ecd30b4e286e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-227bb245-b0b5-451b-8eb2-ecd30b4e286e
Content-Type: application/json

--- request body ---
{"handle":"qa-45984eb00841","password":"****"}

--- response: 401 in 8 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-227bb245-b0b5-451b-8eb2-ecd30b4e286e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 360
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-227bb245-b0b5-451b-8eb2-ecd30b4e286e"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0d1f6517-897a-4091-b5b8-2da8d8e37361

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d1f6517-897a-4091-b5b8-2da8d8e37361
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0d1f6517-897a-4091-b5b8-2da8d8e37361
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
correlation: qa-982b4098-4a43-48f0-834d-a03fbc2a2bbd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-982b4098-4a43-48f0-834d-a03fbc2a2bbd
Content-Type: application/json

--- request body ---
{"handle":"qa-1e87ca3f41cb","password":"****"}

--- response: 401 in 11 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-982b4098-4a43-48f0-834d-a03fbc2a2bbd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 356
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-982b4098-4a43-48f0-834d-a03fbc2a2bbd"}
```
