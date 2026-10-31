# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [PATCH /v1/accounts/me, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[6]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 42 | `qa-67674a88-69ac-4f7f-9a2d-53e1ec344ece` |
| 2 | `POST /v1/accounts` | 201 | 50 | `qa-26ee216f-a99c-4727-abd8-970d383d4071` |
| 3 | `POST /v1/auth/token` | 200 | 22 | `qa-eb82210c-8152-455e-b612-0fc54e61878f` |
| 4 | `POST /v1/conversations` | 201 | 21 | `qa-66a778a0-9e40-48ca-9661-f8ddc87794d7` |
| 5 | `PATCH /v1/accounts/me` | 400 | 17 | `qa-d048b189-3aa4-4cbf-b2e2-2c86bc5aae15` |
| 6 | `POST /v1/auth/token` | 200 | 41 | `qa-ff141445-d922-447f-a37c-51cc8a10c371` |
| 7 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-5efc2e50-c704-4f37-a59e-0a61a7199ba3` |
| 8 | `POST /v1/auth/token` | 401 | 13 | `qa-b9d93ee8-44fd-4979-ae61-9f4c843f6a17` |
| 9 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-506acd58-f2b8-456e-8afe-8e5568cc4cac` |
| 10 | `POST /v1/auth/token` | 401 | 23 | `qa-65efd834-7ad9-4c2c-bf3c-8a287ffcc75d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-67674a88-69ac-4f7f-9a2d-53e1ec344ece

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-67674a88-69ac-4f7f-9a2d-53e1ec344ece
Content-Type: application/json

--- request body ---
{"handle":"qa-964e744d4946","displayName":"QA 964e744d4946","password":"****","region":"eu"}

--- response: 201 in 42 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-67674a88-69ac-4f7f-9a2d-53e1ec344ece
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 471
RateLimit-Reset: 8
Location: /v1/accounts/qa-964e744d4946
X-Served-Region: eu
Content-Length: 181

{"id":"acc_23a3b638-9334-4dfb-b74d-c95ab6116036","handle":"qa-964e744d4946","displayName":"QA 964e744d4946","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.187704993Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-26ee216f-a99c-4727-abd8-970d383d4071

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-26ee216f-a99c-4727-abd8-970d383d4071
Content-Type: application/json

--- request body ---
{"handle":"qa-56566b99482a","displayName":"QA 56566b99482a","password":"****","region":"eu"}

--- response: 201 in 50 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-26ee216f-a99c-4727-abd8-970d383d4071
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 462
RateLimit-Reset: 7
Location: /v1/accounts/qa-56566b99482a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d46285ab-8dce-4b38-bde8-bcb50bffbaf6","handle":"qa-56566b99482a","displayName":"QA 56566b99482a","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.251968903Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-eb82210c-8152-455e-b612-0fc54e61878f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eb82210c-8152-455e-b612-0fc54e61878f
Content-Type: application/json

--- request body ---
{"handle":"qa-964e744d4946","password":"****"}

--- response: 200 in 22 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-eb82210c-8152-455e-b612-0fc54e61878f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 456
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_23a3b638-9334-4dfb-b74d-c95ab6116036"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-66a778a0-9e40-48ca-9661-f8ddc87794d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-66a778a0-9e40-48ca-9661-f8ddc87794d7
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-56566b99482a","subject":"Error contract","message":"Hi"}

--- response: 201 in 21 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-66a778a0-9e40-48ca-9661-f8ddc87794d7
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
Location: /v1/conversations/cnv_cfe5818d-bcef-4d40-b017-7b68748dc574
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_cfe5818d-bcef-4d40-b017-7b68748dc574","subject":"Error contract","status":"open","region":"eu","participants":["qa-964e744d4946","qa-56566b99482a"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-27T08:00:34.325190612Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-d048b189-3aa4-4cbf-b2e2-2c86bc5aae15

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d048b189-3aa4-4cbf-b2e2-2c86bc5aae15
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 17 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d048b189-3aa4-4cbf-b2e2-2c86bc5aae15
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
Content-Length: 256

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/accounts/me","correlationId":"qa-d048b189-3aa4-4cbf-b2e2-2c86bc5aae15"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-ff141445-d922-447f-a37c-51cc8a10c371

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff141445-d922-447f-a37c-51cc8a10c371
Content-Type: application/json

--- request body ---
{"handle":"qa-56566b99482a","password":"****"}

--- response: 200 in 41 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-ff141445-d922-447f-a37c-51cc8a10c371
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 435
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d46285ab-8dce-4b38-bde8-bcb50bffbaf6"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5efc2e50-c704-4f37-a59e-0a61a7199ba3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5efc2e50-c704-4f37-a59e-0a61a7199ba3
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5efc2e50-c704-4f37-a59e-0a61a7199ba3
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
correlation: qa-b9d93ee8-44fd-4979-ae61-9f4c843f6a17

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b9d93ee8-44fd-4979-ae61-9f4c843f6a17
Content-Type: application/json

--- request body ---
{"handle":"qa-56566b99482a","password":"****"}

--- response: 401 in 13 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b9d93ee8-44fd-4979-ae61-9f4c843f6a17
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 428
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b9d93ee8-44fd-4979-ae61-9f4c843f6a17"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-506acd58-f2b8-456e-8afe-8e5568cc4cac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-506acd58-f2b8-456e-8afe-8e5568cc4cac
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-506acd58-f2b8-456e-8afe-8e5568cc4cac
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
correlation: qa-65efd834-7ad9-4c2c-bf3c-8a287ffcc75d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-65efd834-7ad9-4c2c-bf3c-8a287ffcc75d
Content-Type: application/json

--- request body ---
{"handle":"qa-964e744d4946","password":"****"}

--- response: 401 in 23 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-65efd834-7ad9-4c2c-bf3c-8a287ffcc75d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 423
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-65efd834-7ad9-4c2c-bf3c-8a287ffcc75d"}
```
