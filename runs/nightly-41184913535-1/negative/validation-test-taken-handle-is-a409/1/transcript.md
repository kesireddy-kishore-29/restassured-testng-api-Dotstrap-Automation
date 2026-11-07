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
| 1 | `POST /v1/accounts` | 201 | 30 | `qa-0dca7b68-8359-40e3-8ccc-5cc290f16561` |
| 2 | `POST /v1/accounts` | 409 | 15 | `qa-4e030b42-49b6-464c-b805-15731d673cdc` |
| 3 | `POST /v1/auth/token` | 200 | 29 | `qa-ba02207d-c793-4410-849b-bf9eb3491301` |
| 4 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-6dfeb012-5fc9-4781-ba3b-bef0d2c4d865` |
| 5 | `POST /v1/auth/token` | 401 | 19 | `qa-e56f58b3-a706-4ea9-b981-f612f65b8652` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0dca7b68-8359-40e3-8ccc-5cc290f16561

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0dca7b68-8359-40e3-8ccc-5cc290f16561
Content-Type: application/json

--- request body ---
{"handle":"qa-cf082bad5d5a","displayName":"QA cf082bad5d5a","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-0dca7b68-8359-40e3-8ccc-5cc290f16561
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 9
Location: /v1/accounts/qa-cf082bad5d5a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_426dc626-1064-40b2-8c68-1cf54b8d5644","handle":"qa-cf082bad5d5a","displayName":"QA cf082bad5d5a","region":"eu","role":"user","createdAt":"2026-10-31T08:31:37.838018025Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-4e030b42-49b6-464c-b805-15731d673cdc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4e030b42-49b6-464c-b805-15731d673cdc
Content-Type: application/json

--- request body ---
{"handle":"qa-cf082bad5d5a","displayName":"Copy","password":"****","region":"eu"}

--- response: 409 in 15 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4e030b42-49b6-464c-b805-15731d673cdc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 8
Content-Length: 245

{"type":"https://reference-service.example/problems/handle-taken","title":"Handle already taken","status":409,"detail":"The handle 'qa-cf082bad5d5a' is in use.","instance":"/v1/accounts","correlationId":"qa-4e030b42-49b6-464c-b805-15731d673cdc"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-ba02207d-c793-4410-849b-bf9eb3491301

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ba02207d-c793-4410-849b-bf9eb3491301
Content-Type: application/json

--- request body ---
{"handle":"qa-cf082bad5d5a","password":"****"}

--- response: 200 in 29 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-ba02207d-c793-4410-849b-bf9eb3491301
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 569
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_426dc626-1064-40b2-8c68-1cf54b8d5644"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6dfeb012-5fc9-4781-ba3b-bef0d2c4d865

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6dfeb012-5fc9-4781-ba3b-bef0d2c4d865
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6dfeb012-5fc9-4781-ba3b-bef0d2c4d865
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
correlation: qa-e56f58b3-a706-4ea9-b981-f612f65b8652

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e56f58b3-a706-4ea9-b981-f612f65b8652
Content-Type: application/json

--- request body ---
{"handle":"qa-cf082bad5d5a","password":"****"}

--- response: 401 in 19 ms ---
Date: Sat, 31 Oct 2026 08:31:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e56f58b3-a706-4ea9-b981-f612f65b8652
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 568
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e56f58b3-a706-4ea9-b981-f612f65b8652"}
```
