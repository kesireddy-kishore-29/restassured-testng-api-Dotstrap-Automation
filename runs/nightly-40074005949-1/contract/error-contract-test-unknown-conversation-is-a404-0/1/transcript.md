# Transcript: Every conversation operation answers an unknown id with a 404 problem [GET /v1/conversations/{id}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#unknownConversationIsA404[0]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 20 | `qa-5322a193-cec4-41a1-9978-e6f742ec0975` |
| 2 | `POST /v1/auth/token` | 200 | 29 | `qa-59af7bc6-0777-4816-be14-c3803b0f9e2f` |
| 3 | `GET /v1/conversations/{id}` | 404 | 8 | `qa-079ae1af-89a5-4314-89c8-a3ff5f991137` |
| 4 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-26da86e8-ac57-4352-a291-d0f39f55ec33` |
| 5 | `POST /v1/auth/token` | 401 | 4 | `qa-59873ca1-666a-47b4-8b15-7bbe3d82ee4c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5322a193-cec4-41a1-9978-e6f742ec0975

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5322a193-cec4-41a1-9978-e6f742ec0975
Content-Type: application/json

--- request body ---
{"handle":"qa-35ec459667d1","displayName":"QA 35ec459667d1","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-5322a193-cec4-41a1-9978-e6f742ec0975
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 287
RateLimit-Reset: 7
Location: /v1/accounts/qa-35ec459667d1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5ea7f249-9a39-4d26-a44c-35510e702d14","handle":"qa-35ec459667d1","displayName":"QA 35ec459667d1","region":"eu","role":"user","createdAt":"2026-10-24T07:25:04.269202819Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-59af7bc6-0777-4816-be14-c3803b0f9e2f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-59af7bc6-0777-4816-be14-c3803b0f9e2f
Content-Type: application/json

--- request body ---
{"handle":"qa-35ec459667d1","password":"****"}

--- response: 200 in 29 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-59af7bc6-0777-4816-be14-c3803b0f9e2f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 281
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5ea7f249-9a39-4d26-a44c-35510e702d14"}
```

## 3. GET /v1/conversations/{id}

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist
correlation: qa-079ae1af-89a5-4314-89c8-a3ff5f991137

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-079ae1af-89a5-4314-89c8-a3ff5f991137
Content-Type: application/json

--- response: 404 in 8 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-079ae1af-89a5-4314-89c8-a3ff5f991137
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
Content-Length: 253

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist","correlationId":"qa-079ae1af-89a5-4314-89c8-a3ff5f991137"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-26da86e8-ac57-4352-a291-d0f39f55ec33

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-26da86e8-ac57-4352-a291-d0f39f55ec33
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-26da86e8-ac57-4352-a291-d0f39f55ec33
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

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-59873ca1-666a-47b4-8b15-7bbe3d82ee4c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-59873ca1-666a-47b4-8b15-7bbe3d82ee4c
Content-Type: application/json

--- request body ---
{"handle":"qa-35ec459667d1","password":"****"}

--- response: 401 in 4 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-59873ca1-666a-47b4-8b15-7bbe3d82ee4c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 278
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-59873ca1-666a-47b4-8b15-7bbe3d82ee4c"}
```
