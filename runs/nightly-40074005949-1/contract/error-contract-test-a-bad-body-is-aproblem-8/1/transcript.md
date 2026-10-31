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
| 1 | `POST /v1/accounts` | 201 | 23 | `qa-5ea858bb-743a-4862-8a12-bfb76838596f` |
| 2 | `POST /v1/accounts` | 201 | 25 | `qa-4fea8aa9-e01d-4985-aa9b-d8f5f95780aa` |
| 3 | `POST /v1/auth/token` | 200 | 16 | `qa-8c69ae51-e0a6-4449-ae59-96c2711d6bba` |
| 4 | `POST /v1/conversations` | 201 | 18 | `qa-8b17e960-ef17-4ac3-9cf3-97ebb76b568c` |
| 5 | `PATCH /v1/accounts/me` | 422 | 15 | `qa-a1863122-2a2c-4d73-a268-dbcc7858bb4d` |
| 6 | `POST /v1/auth/token` | 200 | 20 | `qa-2e422de0-90f6-4b57-9d74-1c7332cb9146` |
| 7 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-5388715b-7b7b-49b8-ab29-6fbe69667eef` |
| 8 | `POST /v1/auth/token` | 401 | 6 | `qa-4f873244-8929-4e9a-ba80-3483e3b921a0` |
| 9 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-b6a57ede-3727-4b95-acb9-f787e745b339` |
| 10 | `POST /v1/auth/token` | 401 | 9 | `qa-d960e365-12e4-4468-8b95-3c769186c040` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5ea858bb-743a-4862-8a12-bfb76838596f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5ea858bb-743a-4862-8a12-bfb76838596f
Content-Type: application/json

--- request body ---
{"handle":"qa-6c2f9bbe8fd7","displayName":"QA 6c2f9bbe8fd7","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-5ea858bb-743a-4862-8a12-bfb76838596f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 414
RateLimit-Reset: 8
Location: /v1/accounts/qa-6c2f9bbe8fd7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d61b52ab-997c-4f72-b09b-66a3c7f3f368","handle":"qa-6c2f9bbe8fd7","displayName":"QA 6c2f9bbe8fd7","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.282293741Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-4fea8aa9-e01d-4985-aa9b-d8f5f95780aa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4fea8aa9-e01d-4985-aa9b-d8f5f95780aa
Content-Type: application/json

--- request body ---
{"handle":"qa-78081b4630c4","displayName":"QA 78081b4630c4","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-4fea8aa9-e01d-4985-aa9b-d8f5f95780aa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 408
RateLimit-Reset: 8
Location: /v1/accounts/qa-78081b4630c4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_974230ff-ea24-4754-a119-4c049b1e4b26","handle":"qa-78081b4630c4","displayName":"QA 78081b4630c4","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.319047455Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-8c69ae51-e0a6-4449-ae59-96c2711d6bba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c69ae51-e0a6-4449-ae59-96c2711d6bba
Content-Type: application/json

--- request body ---
{"handle":"qa-6c2f9bbe8fd7","password":"****"}

--- response: 200 in 16 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-8c69ae51-e0a6-4449-ae59-96c2711d6bba
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 402
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d61b52ab-997c-4f72-b09b-66a3c7f3f368"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-8b17e960-ef17-4ac3-9cf3-97ebb76b568c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b17e960-ef17-4ac3-9cf3-97ebb76b568c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-78081b4630c4","subject":"Error contract","message":"Hi"}

--- response: 201 in 18 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-8b17e960-ef17-4ac3-9cf3-97ebb76b568c
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
Location: /v1/conversations/cnv_cd39b520-75e8-449c-aec6-2e0513df66d4
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_cd39b520-75e8-449c-aec6-2e0513df66d4","subject":"Error contract","status":"open","region":"eu","participants":["qa-6c2f9bbe8fd7","qa-78081b4630c4"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-24T07:25:03.378142223Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-a1863122-2a2c-4d73-a268-dbcc7858bb4d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a1863122-2a2c-4d73-a268-dbcc7858bb4d
Content-Type: application/json

--- request body ---
{"displayName":"   "}

--- response: 422 in 15 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a1863122-2a2c-4d73-a268-dbcc7858bb4d
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts/me","correlationId":"qa-a1863122-2a2c-4d73-a268-dbcc7858bb4d","errors":[{"field":"displayName","message":"1-60 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-2e422de0-90f6-4b57-9d74-1c7332cb9146

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e422de0-90f6-4b57-9d74-1c7332cb9146
Content-Type: application/json

--- request body ---
{"handle":"qa-78081b4630c4","password":"****"}

--- response: 200 in 20 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-2e422de0-90f6-4b57-9d74-1c7332cb9146
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 386
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_974230ff-ea24-4754-a119-4c049b1e4b26"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5388715b-7b7b-49b8-ab29-6fbe69667eef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5388715b-7b7b-49b8-ab29-6fbe69667eef
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5388715b-7b7b-49b8-ab29-6fbe69667eef
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
correlation: qa-4f873244-8929-4e9a-ba80-3483e3b921a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f873244-8929-4e9a-ba80-3483e3b921a0
Content-Type: application/json

--- request body ---
{"handle":"qa-78081b4630c4","password":"****"}

--- response: 401 in 6 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4f873244-8929-4e9a-ba80-3483e3b921a0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 377
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4f873244-8929-4e9a-ba80-3483e3b921a0"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b6a57ede-3727-4b95-acb9-f787e745b339

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b6a57ede-3727-4b95-acb9-f787e745b339
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b6a57ede-3727-4b95-acb9-f787e745b339
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
correlation: qa-d960e365-12e4-4468-8b95-3c769186c040

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d960e365-12e4-4468-8b95-3c769186c040
Content-Type: application/json

--- request body ---
{"handle":"qa-6c2f9bbe8fd7","password":"****"}

--- response: 401 in 9 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d960e365-12e4-4468-8b95-3c769186c040
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 371
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d960e365-12e4-4468-8b95-3c769186c040"}
```
