# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations/{id}/messages, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[14]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 24 | `qa-c2ce78dd-6f93-475d-92d3-aa0d990a763d` |
| 2 | `POST /v1/accounts` | 201 | 16 | `qa-66103068-8c55-44d8-87f4-0ff08e7c76f6` |
| 3 | `POST /v1/auth/token` | 200 | 34 | `qa-ca8bb499-2294-4cfa-843d-9a059c646230` |
| 4 | `POST /v1/conversations` | 201 | 20 | `qa-efc10e6f-78ce-4097-9851-5c4fbceff402` |
| 5 | `POST /v1/conversations/{id}/messages` | 422 | 43 | `qa-2ce55257-65ca-44b6-ad93-244d74226305` |
| 6 | `POST /v1/auth/token` | 200 | 22 | `qa-b5ab6910-d0d2-4c37-bedb-e2dfa546d19e` |
| 7 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-29211aca-213e-4a05-b3c8-af02116bdb5b` |
| 8 | `POST /v1/auth/token` | 401 | 7 | `qa-46d7d816-9e91-412d-855e-ba1971a161de` |
| 9 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-552a7ec3-8b2c-4405-92b1-c6b2c47fc549` |
| 10 | `POST /v1/auth/token` | 401 | 19 | `qa-651f4c45-ec1e-4930-b922-c65d23a92093` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c2ce78dd-6f93-475d-92d3-aa0d990a763d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c2ce78dd-6f93-475d-92d3-aa0d990a763d
Content-Type: application/json

--- request body ---
{"handle":"qa-786b5742b77c","displayName":"QA 786b5742b77c","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-c2ce78dd-6f93-475d-92d3-aa0d990a763d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 352
RateLimit-Reset: 7
Location: /v1/accounts/qa-786b5742b77c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_cc3b26aa-a59e-40ca-8c54-cd2b8bff315f","handle":"qa-786b5742b77c","displayName":"QA 786b5742b77c","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.844704509Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-66103068-8c55-44d8-87f4-0ff08e7c76f6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-66103068-8c55-44d8-87f4-0ff08e7c76f6
Content-Type: application/json

--- request body ---
{"handle":"qa-2ec2170be5e3","displayName":"QA 2ec2170be5e3","password":"****","region":"eu"}

--- response: 201 in 16 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-66103068-8c55-44d8-87f4-0ff08e7c76f6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 347
RateLimit-Reset: 7
Location: /v1/accounts/qa-2ec2170be5e3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_30d6756d-ccad-4487-9936-df75203b0b39","handle":"qa-2ec2170be5e3","displayName":"QA 2ec2170be5e3","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.875524015Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-ca8bb499-2294-4cfa-843d-9a059c646230

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ca8bb499-2294-4cfa-843d-9a059c646230
Content-Type: application/json

--- request body ---
{"handle":"qa-786b5742b77c","password":"****"}

--- response: 200 in 34 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-ca8bb499-2294-4cfa-843d-9a059c646230
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 342
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cc3b26aa-a59e-40ca-8c54-cd2b8bff315f"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-efc10e6f-78ce-4097-9851-5c4fbceff402

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-efc10e6f-78ce-4097-9851-5c4fbceff402
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-2ec2170be5e3","subject":"Error contract","message":"Hi"}

--- response: 201 in 20 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-efc10e6f-78ce-4097-9851-5c4fbceff402
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
Location: /v1/conversations/cnv_44d5f811-36f7-494a-8983-21ad538c444f
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_44d5f811-36f7-494a-8983-21ad538c444f","subject":"Error contract","status":"open","region":"eu","participants":["qa-786b5742b77c","qa-2ec2170be5e3"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-23T10:54:59.956931527Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_44d5f811-36f7-494a-8983-21ad538c444f/messages
correlation: qa-2ce55257-65ca-44b6-ad93-244d74226305

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2ce55257-65ca-44b6-ad93-244d74226305
Content-Type: application/json

--- request body ---
{"body":" "}

--- response: 422 in 43 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2ce55257-65ca-44b6-ad93-244d74226305
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
Content-Length: 363

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/conversations/cnv_44d5f811-36f7-494a-8983-21ad538c444f/messages","correlationId":"qa-2ce55257-65ca-44b6-ad93-244d74226305","errors":[{"field":"body","message":"1-2000 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-b5ab6910-d0d2-4c37-bedb-e2dfa546d19e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b5ab6910-d0d2-4c37-bedb-e2dfa546d19e
Content-Type: application/json

--- request body ---
{"handle":"qa-2ec2170be5e3","password":"****"}

--- response: 200 in 22 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-b5ab6910-d0d2-4c37-bedb-e2dfa546d19e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 321
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_30d6756d-ccad-4487-9936-df75203b0b39"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-29211aca-213e-4a05-b3c8-af02116bdb5b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-29211aca-213e-4a05-b3c8-af02116bdb5b
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-29211aca-213e-4a05-b3c8-af02116bdb5b
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
correlation: qa-46d7d816-9e91-412d-855e-ba1971a161de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-46d7d816-9e91-412d-855e-ba1971a161de
Content-Type: application/json

--- request body ---
{"handle":"qa-2ec2170be5e3","password":"****"}

--- response: 401 in 7 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-46d7d816-9e91-412d-855e-ba1971a161de
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 316
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-46d7d816-9e91-412d-855e-ba1971a161de"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-552a7ec3-8b2c-4405-92b1-c6b2c47fc549

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-552a7ec3-8b2c-4405-92b1-c6b2c47fc549
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-552a7ec3-8b2c-4405-92b1-c6b2c47fc549
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
correlation: qa-651f4c45-ec1e-4930-b922-c65d23a92093

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-651f4c45-ec1e-4930-b922-c65d23a92093
Content-Type: application/json

--- request body ---
{"handle":"qa-786b5742b77c","password":"****"}

--- response: 401 in 19 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-651f4c45-ec1e-4930-b922-c65d23a92093
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 312
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-651f4c45-ec1e-4930-b922-c65d23a92093"}
```
