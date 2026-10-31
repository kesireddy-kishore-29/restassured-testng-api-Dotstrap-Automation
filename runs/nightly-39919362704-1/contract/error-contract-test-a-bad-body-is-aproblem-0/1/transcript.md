# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/auth/token, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[0]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 49 | `qa-5762438d-05c0-468a-9735-91243e346236` |
| 2 | `POST /v1/accounts` | 201 | 58 | `qa-c597a2fe-4141-4a52-ba1c-cceebf45d58e` |
| 3 | `POST /v1/auth/token` | 200 | 26 | `qa-2f575faf-2542-4308-91cf-5ac19d8fefb2` |
| 4 | `POST /v1/conversations` | 201 | 23 | `qa-a9f1fa7c-e4fb-4658-8e48-964230d85705` |
| 5 | `POST /v1/auth/token` | 400 | 21 | `qa-4b0a9804-1f28-4dbf-9068-d9ff23aad7da` |
| 6 | `POST /v1/auth/token` | 200 | 39 | `qa-372f3b95-d171-4c4e-8009-0179f05a4289` |
| 7 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-88120894-7a21-4642-a9f8-9e3f0a38dc08` |
| 8 | `POST /v1/auth/token` | 401 | 67 | `qa-3a47b38b-6d34-4f70-8fde-be1781175de4` |
| 9 | `DELETE /v1/accounts/me` | 204 | 35 | `qa-20fc59e6-4d82-4e45-9ac5-1f89e47ad8e1` |
| 10 | `POST /v1/auth/token` | 401 | 25 | `qa-7c10bab0-2756-4c47-83e4-4c39a3cc060b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5762438d-05c0-468a-9735-91243e346236

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5762438d-05c0-468a-9735-91243e346236
Content-Type: application/json

--- request body ---
{"handle":"qa-742208497d3a","displayName":"QA 742208497d3a","password":"****","region":"eu"}

--- response: 201 in 49 ms ---
Date: Fri, 23 Oct 2026 07:41:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-5762438d-05c0-468a-9735-91243e346236
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 9
Location: /v1/accounts/qa-742208497d3a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_563ea026-6a19-468d-978c-18e18a0982ab","handle":"qa-742208497d3a","displayName":"QA 742208497d3a","region":"eu","role":"user","createdAt":"2026-10-23T07:41:43.736500073Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-c597a2fe-4141-4a52-ba1c-cceebf45d58e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c597a2fe-4141-4a52-ba1c-cceebf45d58e
Content-Type: application/json

--- request body ---
{"handle":"qa-03c5161111ea","displayName":"QA 03c5161111ea","password":"****","region":"eu"}

--- response: 201 in 58 ms ---
Date: Fri, 23 Oct 2026 07:41:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-c597a2fe-4141-4a52-ba1c-cceebf45d58e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 565
RateLimit-Reset: 9
Location: /v1/accounts/qa-03c5161111ea
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4b3d71f3-735d-400e-bc10-02cb9bdd4057","handle":"qa-03c5161111ea","displayName":"QA 03c5161111ea","region":"eu","role":"user","createdAt":"2026-10-23T07:41:43.811310268Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-2f575faf-2542-4308-91cf-5ac19d8fefb2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f575faf-2542-4308-91cf-5ac19d8fefb2
Content-Type: application/json

--- request body ---
{"handle":"qa-742208497d3a","password":"****"}

--- response: 200 in 26 ms ---
Date: Fri, 23 Oct 2026 07:41:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-2f575faf-2542-4308-91cf-5ac19d8fefb2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 556
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_563ea026-6a19-468d-978c-18e18a0982ab"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-a9f1fa7c-e4fb-4658-8e48-964230d85705

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a9f1fa7c-e4fb-4658-8e48-964230d85705
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-03c5161111ea","subject":"Error contract","message":"Hi"}

--- response: 201 in 23 ms ---
Date: Fri, 23 Oct 2026 07:41:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-a9f1fa7c-e4fb-4658-8e48-964230d85705
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
Location: /v1/conversations/cnv_c8d788e9-0a03-4d5b-8672-0be7f47545b7
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_c8d788e9-0a03-4d5b-8672-0be7f47545b7","subject":"Error contract","status":"open","region":"eu","participants":["qa-742208497d3a","qa-03c5161111ea"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-23T07:41:43.896575856Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-4b0a9804-1f28-4dbf-9068-d9ff23aad7da

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4b0a9804-1f28-4dbf-9068-d9ff23aad7da
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 21 ms ---
Date: Fri, 23 Oct 2026 07:41:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4b0a9804-1f28-4dbf-9068-d9ff23aad7da
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 548
RateLimit-Reset: 9
Content-Length: 255

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/auth/token","correlationId":"qa-4b0a9804-1f28-4dbf-9068-d9ff23aad7da"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-372f3b95-d171-4c4e-8009-0179f05a4289

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-372f3b95-d171-4c4e-8009-0179f05a4289
Content-Type: application/json

--- request body ---
{"handle":"qa-03c5161111ea","password":"****"}

--- response: 200 in 39 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-372f3b95-d171-4c4e-8009-0179f05a4289
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 521
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4b3d71f3-735d-400e-bc10-02cb9bdd4057"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-88120894-7a21-4642-a9f8-9e3f0a38dc08

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-88120894-7a21-4642-a9f8-9e3f0a38dc08
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-88120894-7a21-4642-a9f8-9e3f0a38dc08
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
correlation: qa-3a47b38b-6d34-4f70-8fde-be1781175de4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a47b38b-6d34-4f70-8fde-be1781175de4
Content-Type: application/json

--- request body ---
{"handle":"qa-03c5161111ea","password":"****"}

--- response: 401 in 67 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3a47b38b-6d34-4f70-8fde-be1781175de4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 500
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3a47b38b-6d34-4f70-8fde-be1781175de4"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-20fc59e6-4d82-4e45-9ac5-1f89e47ad8e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-20fc59e6-4d82-4e45-9ac5-1f89e47ad8e1
Content-Type: application/json

--- response: 204 in 35 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-20fc59e6-4d82-4e45-9ac5-1f89e47ad8e1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-7c10bab0-2756-4c47-83e4-4c39a3cc060b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c10bab0-2756-4c47-83e4-4c39a3cc060b
Content-Type: application/json

--- request body ---
{"handle":"qa-742208497d3a","password":"****"}

--- response: 401 in 25 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7c10bab0-2756-4c47-83e4-4c39a3cc060b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 488
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7c10bab0-2756-4c47-83e4-4c39a3cc060b"}
```
