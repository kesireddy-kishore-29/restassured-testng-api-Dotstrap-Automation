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
| 1 | `POST /v1/accounts` | 201 | 421 | `qa-45018379-2c17-4e7a-b746-dba13221052f` |
| 2 | `POST /v1/accounts` | 409 | 16 | `qa-ec0f2391-d879-4f28-b275-b4cb6a4dc574` |
| 3 | `POST /v1/auth/token` | 200 | 35 | `qa-4812278f-b8f2-4bf8-8b86-54533305eeed` |
| 4 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-4ae65fd6-fb34-443e-8cc9-9887b15747e6` |
| 5 | `POST /v1/auth/token` | 401 | 7 | `qa-3274cd26-39b6-4f63-bf17-993d72f0aac9` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-45018379-2c17-4e7a-b746-dba13221052f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-45018379-2c17-4e7a-b746-dba13221052f
Content-Type: application/json

--- request body ---
{"handle":"qa-b123be23f182","displayName":"QA b123be23f182","password":"****","region":"eu"}

--- response: 201 in 421 ms ---
Date: Wed, 11 Nov 2026 09:34:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-45018379-2c17-4e7a-b746-dba13221052f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 11
Location: /v1/accounts/qa-b123be23f182
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e3183cb3-ebad-4275-8375-bc52699fe5b8","handle":"qa-b123be23f182","displayName":"QA b123be23f182","region":"eu","role":"user","createdAt":"2026-11-11T09:34:29.181401731Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-ec0f2391-d879-4f28-b275-b4cb6a4dc574

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ec0f2391-d879-4f28-b275-b4cb6a4dc574
Content-Type: application/json

--- request body ---
{"handle":"qa-b123be23f182","displayName":"Copy","password":"****","region":"eu"}

--- response: 409 in 16 ms ---
Date: Wed, 11 Nov 2026 09:34:29 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ec0f2391-d879-4f28-b275-b4cb6a4dc574
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

{"type":"https://reference-service.example/problems/handle-taken","title":"Handle already taken","status":409,"detail":"The handle 'qa-b123be23f182' is in use.","instance":"/v1/accounts","correlationId":"qa-ec0f2391-d879-4f28-b275-b4cb6a4dc574"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-4812278f-b8f2-4bf8-8b86-54533305eeed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4812278f-b8f2-4bf8-8b86-54533305eeed
Content-Type: application/json

--- request body ---
{"handle":"qa-b123be23f182","password":"****"}

--- response: 200 in 35 ms ---
Date: Wed, 11 Nov 2026 09:34:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-4812278f-b8f2-4bf8-8b86-54533305eeed
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e3183cb3-ebad-4275-8375-bc52699fe5b8"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4ae65fd6-fb34-443e-8cc9-9887b15747e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4ae65fd6-fb34-443e-8cc9-9887b15747e6
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Wed, 11 Nov 2026 09:34:30 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4ae65fd6-fb34-443e-8cc9-9887b15747e6
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
correlation: qa-3274cd26-39b6-4f63-bf17-993d72f0aac9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3274cd26-39b6-4f63-bf17-993d72f0aac9
Content-Type: application/json

--- request body ---
{"handle":"qa-b123be23f182","password":"****"}

--- response: 401 in 7 ms ---
Date: Wed, 11 Nov 2026 09:34:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3274cd26-39b6-4f63-bf17-993d72f0aac9
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3274cd26-39b6-4f63-bf17-993d72f0aac9"}
```
