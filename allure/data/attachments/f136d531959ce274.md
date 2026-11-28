# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[9]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 39 | `qa-39044d5e-af29-4932-bd3f-9f1fcc712e07` |
| 2 | `POST /v1/accounts` | 201 | 41 | `qa-17ed9b54-9c25-438f-bcd7-b70dd8f4b753` |
| 3 | `POST /v1/auth/token` | 200 | 55 | `qa-dc6fe59a-dff3-4028-849c-98578a211f2d` |
| 4 | `POST /v1/conversations` | 201 | 14 | `qa-8ec7de3c-555d-4488-b02b-5f5143713fab` |
| 5 | `POST /v1/conversations` | 400 | 23 | `qa-085bb1d4-acb2-42b5-a544-60202d1881d8` |
| 6 | `POST /v1/auth/token` | 200 | 24 | `qa-ecc10fc2-c28d-44ea-95fe-347b1e42ddad` |
| 7 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-7f1a7f6d-dcc3-4825-a054-97dff92a058a` |
| 8 | `POST /v1/auth/token` | 401 | 28 | `qa-36496d27-6fcb-4742-bea7-d34392c294a1` |
| 9 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-afaf1baf-3839-4dca-aa7f-2626fba244d6` |
| 10 | `POST /v1/auth/token` | 401 | 13 | `qa-e2d5943c-f8bb-4f8d-9a35-01f2cb2a65cf` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-39044d5e-af29-4932-bd3f-9f1fcc712e07

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-39044d5e-af29-4932-bd3f-9f1fcc712e07
Content-Type: application/json

--- request body ---
{"handle":"qa-8c605af60b6b","displayName":"QA 8c605af60b6b","password":"****","region":"eu"}

--- response: 201 in 39 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-39044d5e-af29-4932-bd3f-9f1fcc712e07
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 407
RateLimit-Reset: 7
Location: /v1/accounts/qa-8c605af60b6b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9778db6e-6a66-4d16-8494-6e718fddc940","handle":"qa-8c605af60b6b","displayName":"QA 8c605af60b6b","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.856868703Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-17ed9b54-9c25-438f-bcd7-b70dd8f4b753

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-17ed9b54-9c25-438f-bcd7-b70dd8f4b753
Content-Type: application/json

--- request body ---
{"handle":"qa-644765e84257","displayName":"QA 644765e84257","password":"****","region":"eu"}

--- response: 201 in 41 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-17ed9b54-9c25-438f-bcd7-b70dd8f4b753
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 401
RateLimit-Reset: 7
Location: /v1/accounts/qa-644765e84257
X-Served-Region: eu
Content-Length: 181

{"id":"acc_960d5c0b-f86c-4ff3-a99d-c287f67af9b2","handle":"qa-644765e84257","displayName":"QA 644765e84257","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.917341800Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-dc6fe59a-dff3-4028-849c-98578a211f2d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc6fe59a-dff3-4028-849c-98578a211f2d
Content-Type: application/json

--- request body ---
{"handle":"qa-8c605af60b6b","password":"****"}

--- response: 200 in 55 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-dc6fe59a-dff3-4028-849c-98578a211f2d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 391
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9778db6e-6a66-4d16-8494-6e718fddc940"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-8ec7de3c-555d-4488-b02b-5f5143713fab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ec7de3c-555d-4488-b02b-5f5143713fab
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-644765e84257","subject":"Error contract","message":"Hi"}

--- response: 201 in 14 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-8ec7de3c-555d-4488-b02b-5f5143713fab
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
Location: /v1/conversations/cnv_6f7df871-aecb-4840-9067-34c6a6940a81
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_6f7df871-aecb-4840-9067-34c6a6940a81","subject":"Error contract","status":"open","region":"eu","participants":["qa-8c605af60b6b","qa-644765e84257"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-28T10:37:25.027775828Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-085bb1d4-acb2-42b5-a544-60202d1881d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-085bb1d4-acb2-42b5-a544-60202d1881d8
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 23 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-085bb1d4-acb2-42b5-a544-60202d1881d8
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
Content-Length: 258

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/conversations","correlationId":"qa-085bb1d4-acb2-42b5-a544-60202d1881d8"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-ecc10fc2-c28d-44ea-95fe-347b1e42ddad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ecc10fc2-c28d-44ea-95fe-347b1e42ddad
Content-Type: application/json

--- request body ---
{"handle":"qa-644765e84257","password":"****"}

--- response: 200 in 24 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-ecc10fc2-c28d-44ea-95fe-347b1e42ddad
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 377
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_960d5c0b-f86c-4ff3-a99d-c287f67af9b2"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7f1a7f6d-dcc3-4825-a054-97dff92a058a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7f1a7f6d-dcc3-4825-a054-97dff92a058a
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7f1a7f6d-dcc3-4825-a054-97dff92a058a
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
correlation: qa-36496d27-6fcb-4742-bea7-d34392c294a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-36496d27-6fcb-4742-bea7-d34392c294a1
Content-Type: application/json

--- request body ---
{"handle":"qa-644765e84257","password":"****"}

--- response: 401 in 28 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-36496d27-6fcb-4742-bea7-d34392c294a1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 371
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-36496d27-6fcb-4742-bea7-d34392c294a1"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-afaf1baf-3839-4dca-aa7f-2626fba244d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-afaf1baf-3839-4dca-aa7f-2626fba244d6
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-afaf1baf-3839-4dca-aa7f-2626fba244d6
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
correlation: qa-e2d5943c-f8bb-4f8d-9a35-01f2cb2a65cf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e2d5943c-f8bb-4f8d-9a35-01f2cb2a65cf
Content-Type: application/json

--- request body ---
{"handle":"qa-8c605af60b6b","password":"****"}

--- response: 401 in 13 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e2d5943c-f8bb-4f8d-9a35-01f2cb2a65cf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 362
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e2d5943c-f8bb-4f8d-9a35-01f2cb2a65cf"}
```
