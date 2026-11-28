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
| 1 | `POST /v1/accounts` | 201 | 19 | `qa-0e57f8de-4392-478f-9f85-1e3e02801467` |
| 2 | `POST /v1/accounts` | 409 | 17 | `qa-bb631ed7-0b43-4f51-ae9b-490de527dc84` |
| 3 | `POST /v1/auth/token` | 200 | 17 | `qa-e24d1e96-7c6b-45c2-ab89-d0a3b7db2561` |
| 4 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-60047d19-43c6-4fb2-b027-db0642daa612` |
| 5 | `POST /v1/auth/token` | 401 | 11 | `qa-4915ee1c-d462-43fd-8106-bd833d5f58a1` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0e57f8de-4392-478f-9f85-1e3e02801467

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e57f8de-4392-478f-9f85-1e3e02801467
Content-Type: application/json

--- request body ---
{"handle":"qa-14d25bc98c89","displayName":"QA 14d25bc98c89","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Thu, 26 Nov 2026 11:02:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-0e57f8de-4392-478f-9f85-1e3e02801467
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 587
RateLimit-Reset: 9
Location: /v1/accounts/qa-14d25bc98c89
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1f3a295a-c888-426e-b7ba-6df0baa68054","handle":"qa-14d25bc98c89","displayName":"QA 14d25bc98c89","region":"eu","role":"user","createdAt":"2026-11-26T11:02:35.970903694Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-bb631ed7-0b43-4f51-ae9b-490de527dc84

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb631ed7-0b43-4f51-ae9b-490de527dc84
Content-Type: application/json

--- request body ---
{"handle":"qa-14d25bc98c89","displayName":"Copy","password":"****","region":"eu"}

--- response: 409 in 17 ms ---
Date: Thu, 26 Nov 2026 11:02:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bb631ed7-0b43-4f51-ae9b-490de527dc84
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 586
RateLimit-Reset: 9
Content-Length: 245

{"type":"https://reference-service.example/problems/handle-taken","title":"Handle already taken","status":409,"detail":"The handle 'qa-14d25bc98c89' is in use.","instance":"/v1/accounts","correlationId":"qa-bb631ed7-0b43-4f51-ae9b-490de527dc84"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-e24d1e96-7c6b-45c2-ab89-d0a3b7db2561

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e24d1e96-7c6b-45c2-ab89-d0a3b7db2561
Content-Type: application/json

--- request body ---
{"handle":"qa-14d25bc98c89","password":"****"}

--- response: 200 in 17 ms ---
Date: Thu, 26 Nov 2026 11:02:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-e24d1e96-7c6b-45c2-ab89-d0a3b7db2561
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 581
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1f3a295a-c888-426e-b7ba-6df0baa68054"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-60047d19-43c6-4fb2-b027-db0642daa612

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-60047d19-43c6-4fb2-b027-db0642daa612
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Thu, 26 Nov 2026 11:02:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-60047d19-43c6-4fb2-b027-db0642daa612
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
correlation: qa-4915ee1c-d462-43fd-8106-bd833d5f58a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4915ee1c-d462-43fd-8106-bd833d5f58a1
Content-Type: application/json

--- request body ---
{"handle":"qa-14d25bc98c89","password":"****"}

--- response: 401 in 11 ms ---
Date: Thu, 26 Nov 2026 11:02:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4915ee1c-d462-43fd-8106-bd833d5f58a1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4915ee1c-d462-43fd-8106-bd833d5f58a1"}
```
