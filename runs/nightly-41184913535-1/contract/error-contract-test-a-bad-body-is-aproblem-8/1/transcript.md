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
| 1 | `POST /v1/accounts` | 201 | 48 | `qa-f8283402-e881-4bf1-9794-4faab1465e13` |
| 2 | `POST /v1/accounts` | 201 | 56 | `qa-1096b437-48c9-4f36-9792-59ebef339bd3` |
| 3 | `POST /v1/auth/token` | 200 | 37 | `qa-1e3e9b2c-e556-4948-9c08-5b1ae3153646` |
| 4 | `POST /v1/conversations` | 201 | 26 | `qa-8a795c42-a419-4519-9264-45ce73d64751` |
| 5 | `PATCH /v1/accounts/me` | 422 | 23 | `qa-924579c4-36c6-41cf-83de-56ff56cac6bf` |
| 6 | `POST /v1/auth/token` | 200 | 33 | `qa-0dc25ea7-2bd2-497b-b2bf-e54ed7a905c4` |
| 7 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-ff49e3ed-d68a-4b61-a629-9d727601915c` |
| 8 | `POST /v1/auth/token` | 401 | 15 | `qa-dae5a1e6-2c20-4d25-b81a-f0c71a66b5cf` |
| 9 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-456a56f4-b686-477d-8229-647729e256c4` |
| 10 | `POST /v1/auth/token` | 401 | 9 | `qa-c2811871-8471-4be2-9a31-d9e2adac3d58` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f8283402-e881-4bf1-9794-4faab1465e13

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f8283402-e881-4bf1-9794-4faab1465e13
Content-Type: application/json

--- request body ---
{"handle":"qa-4a9359727369","displayName":"QA 4a9359727369","password":"****","region":"eu"}

--- response: 201 in 48 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-f8283402-e881-4bf1-9794-4faab1465e13
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 437
RateLimit-Reset: 7
Location: /v1/accounts/qa-4a9359727369
X-Served-Region: eu
Content-Length: 181

{"id":"acc_86d257ee-98c9-4ccb-8a0b-f6334be66cbd","handle":"qa-4a9359727369","displayName":"QA 4a9359727369","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.648335618Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-1096b437-48c9-4f36-9792-59ebef339bd3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1096b437-48c9-4f36-9792-59ebef339bd3
Content-Type: application/json

--- request body ---
{"handle":"qa-05c26b92ac16","displayName":"QA 05c26b92ac16","password":"****","region":"eu"}

--- response: 201 in 56 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-1096b437-48c9-4f36-9792-59ebef339bd3
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
Location: /v1/accounts/qa-05c26b92ac16
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8e6f645c-ba40-412a-a751-b3bb2d10b31d","handle":"qa-05c26b92ac16","displayName":"QA 05c26b92ac16","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.737380400Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-1e3e9b2c-e556-4948-9c08-5b1ae3153646

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e3e9b2c-e556-4948-9c08-5b1ae3153646
Content-Type: application/json

--- request body ---
{"handle":"qa-4a9359727369","password":"****"}

--- response: 200 in 37 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-1e3e9b2c-e556-4948-9c08-5b1ae3153646
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 419
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_86d257ee-98c9-4ccb-8a0b-f6334be66cbd"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-8a795c42-a419-4519-9264-45ce73d64751

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8a795c42-a419-4519-9264-45ce73d64751
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-05c26b92ac16","subject":"Error contract","message":"Hi"}

--- response: 201 in 26 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-8a795c42-a419-4519-9264-45ce73d64751
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
Location: /v1/conversations/cnv_d655eedb-94a2-4b59-83e0-2bc04a088d4e
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_d655eedb-94a2-4b59-83e0-2bc04a088d4e","subject":"Error contract","status":"open","region":"eu","participants":["qa-4a9359727369","qa-05c26b92ac16"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-31T08:31:35.836213699Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-924579c4-36c6-41cf-83de-56ff56cac6bf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-924579c4-36c6-41cf-83de-56ff56cac6bf
Content-Type: application/json

--- request body ---
{"displayName":"   "}

--- response: 422 in 23 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-924579c4-36c6-41cf-83de-56ff56cac6bf
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts/me","correlationId":"qa-924579c4-36c6-41cf-83de-56ff56cac6bf","errors":[{"field":"displayName","message":"1-60 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-0dc25ea7-2bd2-497b-b2bf-e54ed7a905c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0dc25ea7-2bd2-497b-b2bf-e54ed7a905c4
Content-Type: application/json

--- request body ---
{"handle":"qa-05c26b92ac16","password":"****"}

--- response: 200 in 33 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-0dc25ea7-2bd2-497b-b2bf-e54ed7a905c4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 401
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8e6f645c-ba40-412a-a751-b3bb2d10b31d"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ff49e3ed-d68a-4b61-a629-9d727601915c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff49e3ed-d68a-4b61-a629-9d727601915c
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ff49e3ed-d68a-4b61-a629-9d727601915c
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
correlation: qa-dae5a1e6-2c20-4d25-b81a-f0c71a66b5cf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dae5a1e6-2c20-4d25-b81a-f0c71a66b5cf
Content-Type: application/json

--- request body ---
{"handle":"qa-05c26b92ac16","password":"****"}

--- response: 401 in 15 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dae5a1e6-2c20-4d25-b81a-f0c71a66b5cf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 394
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-dae5a1e6-2c20-4d25-b81a-f0c71a66b5cf"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-456a56f4-b686-477d-8229-647729e256c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-456a56f4-b686-477d-8229-647729e256c4
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-456a56f4-b686-477d-8229-647729e256c4
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
correlation: qa-c2811871-8471-4be2-9a31-d9e2adac3d58

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c2811871-8471-4be2-9a31-d9e2adac3d58
Content-Type: application/json

--- request body ---
{"handle":"qa-4a9359727369","password":"****"}

--- response: 401 in 9 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c2811871-8471-4be2-9a31-d9e2adac3d58
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 386
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c2811871-8471-4be2-9a31-d9e2adac3d58"}
```
