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
| 1 | `POST /v1/accounts` | 201 | 28 | `qa-e9270fd4-0952-4a14-9251-91036efe47e2` |
| 2 | `POST /v1/accounts` | 201 | 35 | `qa-b821240e-5ab1-44d5-96d2-fb4c84e0fc0c` |
| 3 | `POST /v1/auth/token` | 200 | 30 | `qa-9f6e8b0f-5b36-4da7-b5bd-8db8d03d3ad6` |
| 4 | `POST /v1/conversations` | 201 | 18 | `qa-792ffb01-2af2-4266-898f-887180b12e22` |
| 5 | `PATCH /v1/accounts/me` | 422 | 23 | `qa-f558887a-fec5-44f9-909c-84ab6cd7fe0a` |
| 6 | `POST /v1/auth/token` | 200 | 15 | `qa-8d7967fb-ecd3-4e03-81ea-cb9f42dbf537` |
| 7 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-b6c15fb9-1730-4d47-92f6-eea86fb6dae4` |
| 8 | `POST /v1/auth/token` | 401 | 31 | `qa-7a5f522b-3e74-4da9-ae3e-d4cf55792616` |
| 9 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-6ffbe382-27bd-4cc6-b86a-42d867915fb2` |
| 10 | `POST /v1/auth/token` | 401 | 20 | `qa-8af66833-1717-4d04-a36f-fa7df4336b10` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e9270fd4-0952-4a14-9251-91036efe47e2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e9270fd4-0952-4a14-9251-91036efe47e2
Content-Type: application/json

--- request body ---
{"handle":"qa-234ac0851dfb","displayName":"QA 234ac0851dfb","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-e9270fd4-0952-4a14-9251-91036efe47e2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 421
RateLimit-Reset: 7
Location: /v1/accounts/qa-234ac0851dfb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7d01d207-77d4-49a7-b40f-1e1b14cfc4ee","handle":"qa-234ac0851dfb","displayName":"QA 234ac0851dfb","region":"eu","role":"user","createdAt":"2026-11-27T10:59:59.145692604Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-b821240e-5ab1-44d5-96d2-fb4c84e0fc0c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b821240e-5ab1-44d5-96d2-fb4c84e0fc0c
Content-Type: application/json

--- request body ---
{"handle":"qa-31ab2dc3ae7e","displayName":"QA 31ab2dc3ae7e","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-b821240e-5ab1-44d5-96d2-fb4c84e0fc0c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 414
RateLimit-Reset: 7
Location: /v1/accounts/qa-31ab2dc3ae7e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8f6f4c14-8260-4ba6-8209-0b8267c1de6d","handle":"qa-31ab2dc3ae7e","displayName":"QA 31ab2dc3ae7e","region":"eu","role":"user","createdAt":"2026-11-27T10:59:59.197062402Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-9f6e8b0f-5b36-4da7-b5bd-8db8d03d3ad6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9f6e8b0f-5b36-4da7-b5bd-8db8d03d3ad6
Content-Type: application/json

--- request body ---
{"handle":"qa-234ac0851dfb","password":"****"}

--- response: 200 in 30 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-9f6e8b0f-5b36-4da7-b5bd-8db8d03d3ad6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 409
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7d01d207-77d4-49a7-b40f-1e1b14cfc4ee"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-792ffb01-2af2-4266-898f-887180b12e22

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-792ffb01-2af2-4266-898f-887180b12e22
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-31ab2dc3ae7e","subject":"Error contract","message":"Hi"}

--- response: 201 in 18 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-792ffb01-2af2-4266-898f-887180b12e22
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
Location: /v1/conversations/cnv_526d42f1-e43f-4f0a-bcec-ef342a187aa0
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_526d42f1-e43f-4f0a-bcec-ef342a187aa0","subject":"Error contract","status":"open","region":"eu","participants":["qa-234ac0851dfb","qa-31ab2dc3ae7e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-27T10:59:59.293181867Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-f558887a-fec5-44f9-909c-84ab6cd7fe0a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f558887a-fec5-44f9-909c-84ab6cd7fe0a
Content-Type: application/json

--- request body ---
{"displayName":"   "}

--- response: 422 in 23 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f558887a-fec5-44f9-909c-84ab6cd7fe0a
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts/me","correlationId":"qa-f558887a-fec5-44f9-909c-84ab6cd7fe0a","errors":[{"field":"displayName","message":"1-60 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-8d7967fb-ecd3-4e03-81ea-cb9f42dbf537

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8d7967fb-ecd3-4e03-81ea-cb9f42dbf537
Content-Type: application/json

--- request body ---
{"handle":"qa-31ab2dc3ae7e","password":"****"}

--- response: 200 in 15 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-8d7967fb-ecd3-4e03-81ea-cb9f42dbf537
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8f6f4c14-8260-4ba6-8209-0b8267c1de6d"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b6c15fb9-1730-4d47-92f6-eea86fb6dae4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b6c15fb9-1730-4d47-92f6-eea86fb6dae4
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b6c15fb9-1730-4d47-92f6-eea86fb6dae4
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
correlation: qa-7a5f522b-3e74-4da9-ae3e-d4cf55792616

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7a5f522b-3e74-4da9-ae3e-d4cf55792616
Content-Type: application/json

--- request body ---
{"handle":"qa-31ab2dc3ae7e","password":"****"}

--- response: 401 in 31 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7a5f522b-3e74-4da9-ae3e-d4cf55792616
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 379
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7a5f522b-3e74-4da9-ae3e-d4cf55792616"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6ffbe382-27bd-4cc6-b86a-42d867915fb2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ffbe382-27bd-4cc6-b86a-42d867915fb2
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6ffbe382-27bd-4cc6-b86a-42d867915fb2
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
correlation: qa-8af66833-1717-4d04-a36f-fa7df4336b10

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8af66833-1717-4d04-a36f-fa7df4336b10
Content-Type: application/json

--- request body ---
{"handle":"qa-234ac0851dfb","password":"****"}

--- response: 401 in 20 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8af66833-1717-4d04-a36f-fa7df4336b10
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 374
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8af66833-1717-4d04-a36f-fa7df4336b10"}
```
