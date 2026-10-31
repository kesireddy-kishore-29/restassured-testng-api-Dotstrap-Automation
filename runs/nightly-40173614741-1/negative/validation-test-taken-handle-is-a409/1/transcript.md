# Transcript: A handle that is already taken is a 409

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.ValidationTest#takenHandleIsA409` |
| Features | FEAT-ACCT-01, FEAT-ERR-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 491 | `qa-9d9a8d60-3eb4-442d-83eb-c4af6fdef92c` |
| 2 | `POST /v1/accounts` | 409 | 30 | `qa-8aef0f3b-c1b7-4e9e-9132-a0970267e4d9` |
| 3 | `POST /v1/auth/token` | 200 | 29 | `qa-a26cfafd-5658-4bf1-8831-449bbc431029` |
| 4 | `DELETE /v1/accounts/me` | 204 | 30 | `qa-f12dd7aa-8a73-45ed-89d3-50aed0a28881` |
| 5 | `POST /v1/auth/token` | 401 | 28 | `qa-08c79ccf-50ae-473e-9b6e-15a6f37bf49b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9d9a8d60-3eb4-442d-83eb-c4af6fdef92c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d9a8d60-3eb4-442d-83eb-c4af6fdef92c
Content-Type: application/json

--- request body ---
{"handle":"qa-a275948a091e","displayName":"QA a275948a091e","password":"****","region":"eu"}

--- response: 201 in 491 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-9d9a8d60-3eb4-442d-83eb-c4af6fdef92c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 10
Location: /v1/accounts/qa-a275948a091e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bd679752-05b9-42f3-982c-5cbb1e0fb873","handle":"qa-a275948a091e","displayName":"QA a275948a091e","region":"eu","role":"user","createdAt":"2026-10-25T07:40:24.257442580Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-8aef0f3b-c1b7-4e9e-9132-a0970267e4d9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8aef0f3b-c1b7-4e9e-9132-a0970267e4d9
Content-Type: application/json

--- request body ---
{"handle":"qa-a275948a091e","displayName":"Copy","password":"****","region":"eu"}

--- response: 409 in 30 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8aef0f3b-c1b7-4e9e-9132-a0970267e4d9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 592
RateLimit-Reset: 10
Content-Length: 245

{"type":"https://reference-service.example/problems/handle-taken","title":"Handle already taken","status":409,"detail":"The handle 'qa-a275948a091e' is in use.","instance":"/v1/accounts","correlationId":"qa-8aef0f3b-c1b7-4e9e-9132-a0970267e4d9"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-a26cfafd-5658-4bf1-8831-449bbc431029

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a26cfafd-5658-4bf1-8831-449bbc431029
Content-Type: application/json

--- request body ---
{"handle":"qa-a275948a091e","password":"****"}

--- response: 200 in 29 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-a26cfafd-5658-4bf1-8831-449bbc431029
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bd679752-05b9-42f3-982c-5cbb1e0fb873"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f12dd7aa-8a73-45ed-89d3-50aed0a28881

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f12dd7aa-8a73-45ed-89d3-50aed0a28881
Content-Type: application/json

--- response: 204 in 30 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f12dd7aa-8a73-45ed-89d3-50aed0a28881
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

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-08c79ccf-50ae-473e-9b6e-15a6f37bf49b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08c79ccf-50ae-473e-9b6e-15a6f37bf49b
Content-Type: application/json

--- request body ---
{"handle":"qa-a275948a091e","password":"****"}

--- response: 401 in 28 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-08c79ccf-50ae-473e-9b6e-15a6f37bf49b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 589
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-08c79ccf-50ae-473e-9b6e-15a6f37bf49b"}
```
