# Transcript: Every conversation operation answers an unknown id with a 404 problem [POST /v1/conversations/{id}/read]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#unknownConversationIsA404[3]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 20 | `qa-506d8520-9111-4086-88e9-5376c490777b` |
| 2 | `POST /v1/auth/token` | 200 | 9 | `qa-488ec998-574f-4c28-82b6-0ff3f350c22f` |
| 3 | `POST /v1/conversations/{id}/read` | 404 | 12 | `qa-aebcbb8b-e409-47c4-a063-ba814fa4a229` |
| 4 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-4ba185a3-5151-4df8-9f1d-363c22e132e4` |
| 5 | `POST /v1/auth/token` | 401 | 4 | `qa-9f0ebef1-962b-4911-8e03-d5f07ef52579` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-506d8520-9111-4086-88e9-5376c490777b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-506d8520-9111-4086-88e9-5376c490777b
Content-Type: application/json

--- request body ---
{"handle":"qa-a6c260fa7978","displayName":"QA a6c260fa7978","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-506d8520-9111-4086-88e9-5376c490777b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 288
RateLimit-Reset: 8
Location: /v1/accounts/qa-a6c260fa7978
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8e43ea5f-2f23-410f-96c6-2929b242e008","handle":"qa-a6c260fa7978","displayName":"QA a6c260fa7978","region":"eu","role":"user","createdAt":"2026-11-08T09:09:03.864207486Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-488ec998-574f-4c28-82b6-0ff3f350c22f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-488ec998-574f-4c28-82b6-0ff3f350c22f
Content-Type: application/json

--- request body ---
{"handle":"qa-a6c260fa7978","password":"****"}

--- response: 200 in 9 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-488ec998-574f-4c28-82b6-0ff3f350c22f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 285
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8e43ea5f-2f23-410f-96c6-2929b242e008"}
```

## 3. POST /v1/conversations/{id}/read

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/read
correlation: qa-aebcbb8b-e409-47c4-a063-ba814fa4a229

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aebcbb8b-e409-47c4-a063-ba814fa4a229
Content-Type: application/json

--- response: 404 in 12 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-aebcbb8b-e409-47c4-a063-ba814fa4a229
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
Content-Length: 258

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/read","correlationId":"qa-aebcbb8b-e409-47c4-a063-ba814fa4a229"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4ba185a3-5151-4df8-9f1d-363c22e132e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4ba185a3-5151-4df8-9f1d-363c22e132e4
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4ba185a3-5151-4df8-9f1d-363c22e132e4
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
correlation: qa-9f0ebef1-962b-4911-8e03-d5f07ef52579

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9f0ebef1-962b-4911-8e03-d5f07ef52579
Content-Type: application/json

--- request body ---
{"handle":"qa-a6c260fa7978","password":"****"}

--- response: 401 in 4 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9f0ebef1-962b-4911-8e03-d5f07ef52579
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 271
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9f0ebef1-962b-4911-8e03-d5f07ef52579"}
```
