# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [PATCH /v1/accounts/me, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[8]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 17 | `qa-e73d5efb-4ee3-41f6-8757-35f7ba814d58` |
| 2 | `POST /v1/accounts` | 201 | 32 | `qa-eeefca28-b204-46ec-ab37-1b3a8f520d41` |
| 3 | `POST /v1/auth/token` | 200 | 42 | `qa-4070711c-1bcd-405f-a8f0-53d7433e0db5` |
| 4 | `POST /v1/conversations` | 201 | 21 | `qa-923ef2e5-963e-4067-911e-a08fd246c02a` |
| 5 | `PATCH /v1/accounts/me` | 422 | 21 | `qa-2cce6672-af1d-405b-8057-68a6a65d595d` |
| 6 | `POST /v1/auth/token` | 200 | 32 | `qa-b6885d55-e34f-463d-8308-55a770fa951a` |
| 7 | `DELETE /v1/accounts/me` | 204 | 42 | `qa-853756e6-8d16-4181-a62d-b7935e3cb254` |
| 8 | `POST /v1/auth/token` | 401 | 27 | `qa-b1a4f2ae-93b9-4f0a-b870-002971b77739` |
| 9 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-932bafa5-6a64-423f-addf-3ee3a225ccd2` |
| 10 | `POST /v1/auth/token` | 401 | 13 | `qa-c87c4cac-9ab8-46eb-b4f8-de1177328e62` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e73d5efb-4ee3-41f6-8757-35f7ba814d58

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e73d5efb-4ee3-41f6-8757-35f7ba814d58
Content-Type: application/json

--- request body ---
{"handle":"qa-43783daeeca9","displayName":"QA 43783daeeca9","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-e73d5efb-4ee3-41f6-8757-35f7ba814d58
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 410
RateLimit-Reset: 7
Location: /v1/accounts/qa-43783daeeca9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2c370125-acf9-46d5-8b71-d551167c02be","handle":"qa-43783daeeca9","displayName":"QA 43783daeeca9","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.831114371Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-eeefca28-b204-46ec-ab37-1b3a8f520d41

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eeefca28-b204-46ec-ab37-1b3a8f520d41
Content-Type: application/json

--- request body ---
{"handle":"qa-151b84f67b60","displayName":"QA 151b84f67b60","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-eeefca28-b204-46ec-ab37-1b3a8f520d41
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 404
RateLimit-Reset: 7
Location: /v1/accounts/qa-151b84f67b60
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8e4ad43d-0a6b-4c16-a301-9eb7bb5892c6","handle":"qa-151b84f67b60","displayName":"QA 151b84f67b60","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.891279434Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-4070711c-1bcd-405f-a8f0-53d7433e0db5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4070711c-1bcd-405f-a8f0-53d7433e0db5
Content-Type: application/json

--- request body ---
{"handle":"qa-43783daeeca9","password":"****"}

--- response: 200 in 42 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-4070711c-1bcd-405f-a8f0-53d7433e0db5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 397
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2c370125-acf9-46d5-8b71-d551167c02be"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-923ef2e5-963e-4067-911e-a08fd246c02a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-923ef2e5-963e-4067-911e-a08fd246c02a
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-151b84f67b60","subject":"Error contract","message":"Hi"}

--- response: 201 in 21 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-923ef2e5-963e-4067-911e-a08fd246c02a
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
Location: /v1/conversations/cnv_8bd78d44-5833-48c6-a9d7-1d1dec8b18bb
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_8bd78d44-5833-48c6-a9d7-1d1dec8b18bb","subject":"Error contract","status":"open","region":"eu","participants":["qa-43783daeeca9","qa-151b84f67b60"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-28T10:37:24.973280459Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-2cce6672-af1d-405b-8057-68a6a65d595d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2cce6672-af1d-405b-8057-68a6a65d595d
Content-Type: application/json

--- request body ---
{"displayName":"   "}

--- response: 422 in 21 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2cce6672-af1d-405b-8057-68a6a65d595d
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
Content-Length: 316

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts/me","correlationId":"qa-2cce6672-af1d-405b-8057-68a6a65d595d","errors":[{"field":"displayName","message":"1-60 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-b6885d55-e34f-463d-8308-55a770fa951a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b6885d55-e34f-463d-8308-55a770fa951a
Content-Type: application/json

--- request body ---
{"handle":"qa-151b84f67b60","password":"****"}

--- response: 200 in 32 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-b6885d55-e34f-463d-8308-55a770fa951a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 376
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8e4ad43d-0a6b-4c16-a301-9eb7bb5892c6"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-853756e6-8d16-4181-a62d-b7935e3cb254

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-853756e6-8d16-4181-a62d-b7935e3cb254
Content-Type: application/json

--- response: 204 in 42 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-853756e6-8d16-4181-a62d-b7935e3cb254
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
correlation: qa-b1a4f2ae-93b9-4f0a-b870-002971b77739

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b1a4f2ae-93b9-4f0a-b870-002971b77739
Content-Type: application/json

--- request body ---
{"handle":"qa-151b84f67b60","password":"****"}

--- response: 401 in 27 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b1a4f2ae-93b9-4f0a-b870-002971b77739
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 367
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b1a4f2ae-93b9-4f0a-b870-002971b77739"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-932bafa5-6a64-423f-addf-3ee3a225ccd2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-932bafa5-6a64-423f-addf-3ee3a225ccd2
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-932bafa5-6a64-423f-addf-3ee3a225ccd2
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
correlation: qa-c87c4cac-9ab8-46eb-b4f8-de1177328e62

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c87c4cac-9ab8-46eb-b4f8-de1177328e62
Content-Type: application/json

--- request body ---
{"handle":"qa-43783daeeca9","password":"****"}

--- response: 401 in 13 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c87c4cac-9ab8-46eb-b4f8-de1177328e62
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 359
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c87c4cac-9ab8-46eb-b4f8-de1177328e62"}
```
