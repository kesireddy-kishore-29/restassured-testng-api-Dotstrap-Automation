# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [PATCH /v1/accounts/me, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[6]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 28 | `qa-d51f2d5b-f019-4f4f-82b5-6a898aff351a` |
| 2 | `POST /v1/accounts` | 201 | 26 | `qa-5bfc0b0f-9860-43f0-adc2-1a0a4407a85f` |
| 3 | `POST /v1/auth/token` | 200 | 36 | `qa-b5520a82-9b62-41aa-aae9-c7c63f1fa7f0` |
| 4 | `POST /v1/conversations` | 201 | 17 | `qa-618023d2-2d05-43c0-8e87-142c6b92bcbc` |
| 5 | `PATCH /v1/accounts/me` | 400 | 24 | `qa-52bf38a7-4f2e-4a04-8d1d-8ce09252a04a` |
| 6 | `POST /v1/auth/token` | 200 | 25 | `qa-8cbad084-42d7-4268-92b4-2df4f16adf40` |
| 7 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-cc4a44c0-a27f-44ce-afe4-174aa748bebd` |
| 8 | `POST /v1/auth/token` | 401 | 38 | `qa-c22058c4-38d1-44cd-8b16-2550284bb7bf` |
| 9 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-d5973c75-8a96-46d7-bfce-e04d925f5194` |
| 10 | `POST /v1/auth/token` | 401 | 7 | `qa-7860a9b8-cc8d-4660-bc14-7fc9aa8cdd9d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d51f2d5b-f019-4f4f-82b5-6a898aff351a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d51f2d5b-f019-4f4f-82b5-6a898aff351a
Content-Type: application/json

--- request body ---
{"handle":"qa-ab8c428fc717","displayName":"QA ab8c428fc717","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-d51f2d5b-f019-4f4f-82b5-6a898aff351a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 473
RateLimit-Reset: 8
Location: /v1/accounts/qa-ab8c428fc717
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ff157ec1-0c78-43f7-a9fa-44d9ca07281e","handle":"qa-ab8c428fc717","displayName":"QA ab8c428fc717","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.456466035Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-5bfc0b0f-9860-43f0-adc2-1a0a4407a85f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5bfc0b0f-9860-43f0-adc2-1a0a4407a85f
Content-Type: application/json

--- request body ---
{"handle":"qa-dc9ab91d53f2","displayName":"QA dc9ab91d53f2","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-5bfc0b0f-9860-43f0-adc2-1a0a4407a85f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 465
RateLimit-Reset: 8
Location: /v1/accounts/qa-dc9ab91d53f2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9943d964-56e2-44bf-b57c-f2a1598e7e24","handle":"qa-dc9ab91d53f2","displayName":"QA dc9ab91d53f2","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.492197611Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-b5520a82-9b62-41aa-aae9-c7c63f1fa7f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b5520a82-9b62-41aa-aae9-c7c63f1fa7f0
Content-Type: application/json

--- request body ---
{"handle":"qa-ab8c428fc717","password":"****"}

--- response: 200 in 36 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-b5520a82-9b62-41aa-aae9-c7c63f1fa7f0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 457
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ff157ec1-0c78-43f7-a9fa-44d9ca07281e"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-618023d2-2d05-43c0-8e87-142c6b92bcbc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-618023d2-2d05-43c0-8e87-142c6b92bcbc
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-dc9ab91d53f2","subject":"Error contract","message":"Hi"}

--- response: 201 in 17 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-618023d2-2d05-43c0-8e87-142c6b92bcbc
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
Location: /v1/conversations/cnv_b494a350-233a-465d-8ab2-cbd7ed003da2
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_b494a350-233a-465d-8ab2-cbd7ed003da2","subject":"Error contract","status":"open","region":"eu","participants":["qa-ab8c428fc717","qa-dc9ab91d53f2"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-07T08:54:58.564893243Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-52bf38a7-4f2e-4a04-8d1d-8ce09252a04a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-52bf38a7-4f2e-4a04-8d1d-8ce09252a04a
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 24 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-52bf38a7-4f2e-4a04-8d1d-8ce09252a04a
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
Content-Length: 256

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/accounts/me","correlationId":"qa-52bf38a7-4f2e-4a04-8d1d-8ce09252a04a"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-8cbad084-42d7-4268-92b4-2df4f16adf40

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8cbad084-42d7-4268-92b4-2df4f16adf40
Content-Type: application/json

--- request body ---
{"handle":"qa-dc9ab91d53f2","password":"****"}

--- response: 200 in 25 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-8cbad084-42d7-4268-92b4-2df4f16adf40
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 438
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9943d964-56e2-44bf-b57c-f2a1598e7e24"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cc4a44c0-a27f-44ce-afe4-174aa748bebd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc4a44c0-a27f-44ce-afe4-174aa748bebd
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cc4a44c0-a27f-44ce-afe4-174aa748bebd
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
correlation: qa-c22058c4-38d1-44cd-8b16-2550284bb7bf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c22058c4-38d1-44cd-8b16-2550284bb7bf
Content-Type: application/json

--- request body ---
{"handle":"qa-dc9ab91d53f2","password":"****"}

--- response: 401 in 38 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c22058c4-38d1-44cd-8b16-2550284bb7bf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 430
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c22058c4-38d1-44cd-8b16-2550284bb7bf"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d5973c75-8a96-46d7-bfce-e04d925f5194

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d5973c75-8a96-46d7-bfce-e04d925f5194
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d5973c75-8a96-46d7-bfce-e04d925f5194
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
correlation: qa-7860a9b8-cc8d-4660-bc14-7fc9aa8cdd9d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7860a9b8-cc8d-4660-bc14-7fc9aa8cdd9d
Content-Type: application/json

--- request body ---
{"handle":"qa-ab8c428fc717","password":"****"}

--- response: 401 in 7 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7860a9b8-cc8d-4660-bc14-7fc9aa8cdd9d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 421
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7860a9b8-cc8d-4660-bc14-7fc9aa8cdd9d"}
```
