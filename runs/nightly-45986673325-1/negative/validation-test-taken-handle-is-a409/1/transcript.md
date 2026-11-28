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
| 1 | `POST /v1/accounts` | 201 | 14 | `qa-b42e8718-b25a-4744-95cd-b4d0f514956f` |
| 2 | `POST /v1/accounts` | 409 | 22 | `qa-10ef9395-a020-426b-b4b1-244946d2ceae` |
| 3 | `POST /v1/auth/token` | 200 | 22 | `qa-5aba856d-b06e-48bf-af96-e9ca3155611f` |
| 4 | `DELETE /v1/accounts/me` | 204 | 27 | `qa-1723e91e-2293-4487-972b-fa32ac1edf4c` |
| 5 | `POST /v1/auth/token` | 401 | 6 | `qa-755cf83f-2514-452b-9133-e42890f0bed0` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b42e8718-b25a-4744-95cd-b4d0f514956f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b42e8718-b25a-4744-95cd-b4d0f514956f
Content-Type: application/json

--- request body ---
{"handle":"qa-1bd1ba22499b","displayName":"QA 1bd1ba22499b","password":"****","region":"eu"}

--- response: 201 in 14 ms ---
Date: Fri, 27 Nov 2026 10:59:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-b42e8718-b25a-4744-95cd-b4d0f514956f
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
Location: /v1/accounts/qa-1bd1ba22499b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_dc63fbc9-342b-4734-80b6-403b71feac06","handle":"qa-1bd1ba22499b","displayName":"QA 1bd1ba22499b","region":"eu","role":"user","createdAt":"2026-11-27T10:59:51.461533249Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-10ef9395-a020-426b-b4b1-244946d2ceae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-10ef9395-a020-426b-b4b1-244946d2ceae
Content-Type: application/json

--- request body ---
{"handle":"qa-1bd1ba22499b","displayName":"Copy","password":"****","region":"eu"}

--- response: 409 in 22 ms ---
Date: Fri, 27 Nov 2026 10:59:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-10ef9395-a020-426b-b4b1-244946d2ceae
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 9
Content-Length: 245

{"type":"https://reference-service.example/problems/handle-taken","title":"Handle already taken","status":409,"detail":"The handle 'qa-1bd1ba22499b' is in use.","instance":"/v1/accounts","correlationId":"qa-10ef9395-a020-426b-b4b1-244946d2ceae"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-5aba856d-b06e-48bf-af96-e9ca3155611f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5aba856d-b06e-48bf-af96-e9ca3155611f
Content-Type: application/json

--- request body ---
{"handle":"qa-1bd1ba22499b","password":"****"}

--- response: 200 in 22 ms ---
Date: Fri, 27 Nov 2026 10:59:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-5aba856d-b06e-48bf-af96-e9ca3155611f
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_dc63fbc9-342b-4734-80b6-403b71feac06"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1723e91e-2293-4487-972b-fa32ac1edf4c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1723e91e-2293-4487-972b-fa32ac1edf4c
Content-Type: application/json

--- response: 204 in 27 ms ---
Date: Fri, 27 Nov 2026 10:59:51 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1723e91e-2293-4487-972b-fa32ac1edf4c
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
correlation: qa-755cf83f-2514-452b-9133-e42890f0bed0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-755cf83f-2514-452b-9133-e42890f0bed0
Content-Type: application/json

--- request body ---
{"handle":"qa-1bd1ba22499b","password":"****"}

--- response: 401 in 6 ms ---
Date: Fri, 27 Nov 2026 10:59:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-755cf83f-2514-452b-9133-e42890f0bed0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-755cf83f-2514-452b-9133-e42890f0bed0"}
```
