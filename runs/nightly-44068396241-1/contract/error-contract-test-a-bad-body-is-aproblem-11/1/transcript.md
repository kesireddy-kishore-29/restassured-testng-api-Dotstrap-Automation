# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[11]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 13 | `qa-0a5972f1-777a-45db-8459-7c763726204d` |
| 2 | `POST /v1/accounts` | 201 | 20 | `qa-8b237ee4-61e6-4e7b-ba22-806460705c0c` |
| 3 | `POST /v1/auth/token` | 200 | 42 | `qa-cd6274fb-e9e1-4f7b-90f6-5143a7017fc7` |
| 4 | `POST /v1/conversations` | 201 | 13 | `qa-4e12499c-4675-4eb5-82cf-8431b66b506c` |
| 5 | `POST /v1/conversations` | 422 | 7 | `qa-8f869aba-b4ee-40dd-8aa1-829871546e9d` |
| 6 | `POST /v1/auth/token` | 200 | 18 | `qa-5355b64f-2d2a-4501-a1fb-7ca77af3e6c1` |
| 7 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-5dd8db83-382d-4ada-bc9a-3a0e4695f059` |
| 8 | `POST /v1/auth/token` | 401 | 16 | `qa-d32dfc14-001f-4b12-8ba0-e69482fb65e7` |
| 9 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-dbb2cda5-65fc-4bd6-a858-1c281fd22a66` |
| 10 | `POST /v1/auth/token` | 401 | 19 | `qa-dbf65c8c-0c59-4e76-924a-d6d45c64a8b8` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0a5972f1-777a-45db-8459-7c763726204d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0a5972f1-777a-45db-8459-7c763726204d
Content-Type: application/json

--- request body ---
{"handle":"qa-fffca773686e","displayName":"QA fffca773686e","password":"****","region":"eu"}

--- response: 201 in 13 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-0a5972f1-777a-45db-8459-7c763726204d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 395
RateLimit-Reset: 8
Location: /v1/accounts/qa-fffca773686e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2d158899-ec8a-46c3-8571-35859311348f","handle":"qa-fffca773686e","displayName":"QA fffca773686e","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.455752142Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-8b237ee4-61e6-4e7b-ba22-806460705c0c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b237ee4-61e6-4e7b-ba22-806460705c0c
Content-Type: application/json

--- request body ---
{"handle":"qa-16ac703db985","displayName":"QA 16ac703db985","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-8b237ee4-61e6-4e7b-ba22-806460705c0c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 392
RateLimit-Reset: 8
Location: /v1/accounts/qa-16ac703db985
X-Served-Region: eu
Content-Length: 181

{"id":"acc_929eb1a8-b2bb-4500-bda2-065d93131aa9","handle":"qa-16ac703db985","displayName":"QA 16ac703db985","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.497980360Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-cd6274fb-e9e1-4f7b-90f6-5143a7017fc7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd6274fb-e9e1-4f7b-90f6-5143a7017fc7
Content-Type: application/json

--- request body ---
{"handle":"qa-fffca773686e","password":"****"}

--- response: 200 in 42 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-cd6274fb-e9e1-4f7b-90f6-5143a7017fc7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 388
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2d158899-ec8a-46c3-8571-35859311348f"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-4e12499c-4675-4eb5-82cf-8431b66b506c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4e12499c-4675-4eb5-82cf-8431b66b506c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-16ac703db985","subject":"Error contract","message":"Hi"}

--- response: 201 in 13 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-4e12499c-4675-4eb5-82cf-8431b66b506c
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
Location: /v1/conversations/cnv_887c4424-3131-4d5a-b7ce-24c07649c244
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_887c4424-3131-4d5a-b7ce-24c07649c244","subject":"Error contract","status":"open","region":"eu","participants":["qa-fffca773686e","qa-16ac703db985"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-17T10:50:19.577400211Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-8f869aba-b4ee-40dd-8aa1-829871546e9d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f869aba-b4ee-40dd-8aa1-829871546e9d
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-16ac703db985","subject":" ","message":"Hi"}

--- response: 422 in 7 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8f869aba-b4ee-40dd-8aa1-829871546e9d
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
Content-Length: 315

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/conversations","correlationId":"qa-8f869aba-b4ee-40dd-8aa1-829871546e9d","errors":[{"field":"subject","message":"1-120 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-5355b64f-2d2a-4501-a1fb-7ca77af3e6c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5355b64f-2d2a-4501-a1fb-7ca77af3e6c1
Content-Type: application/json

--- request body ---
{"handle":"qa-16ac703db985","password":"****"}

--- response: 200 in 18 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-5355b64f-2d2a-4501-a1fb-7ca77af3e6c1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 366
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_929eb1a8-b2bb-4500-bda2-065d93131aa9"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5dd8db83-382d-4ada-bc9a-3a0e4695f059

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5dd8db83-382d-4ada-bc9a-3a0e4695f059
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5dd8db83-382d-4ada-bc9a-3a0e4695f059
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
correlation: qa-d32dfc14-001f-4b12-8ba0-e69482fb65e7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d32dfc14-001f-4b12-8ba0-e69482fb65e7
Content-Type: application/json

--- request body ---
{"handle":"qa-16ac703db985","password":"****"}

--- response: 401 in 16 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d32dfc14-001f-4b12-8ba0-e69482fb65e7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 359
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d32dfc14-001f-4b12-8ba0-e69482fb65e7"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-dbb2cda5-65fc-4bd6-a858-1c281fd22a66

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dbb2cda5-65fc-4bd6-a858-1c281fd22a66
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: text/plain
X-Correlation-Id: qa-dbb2cda5-65fc-4bd6-a858-1c281fd22a66
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
correlation: qa-dbf65c8c-0c59-4e76-924a-d6d45c64a8b8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dbf65c8c-0c59-4e76-924a-d6d45c64a8b8
Content-Type: application/json

--- request body ---
{"handle":"qa-fffca773686e","password":"****"}

--- response: 401 in 19 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dbf65c8c-0c59-4e76-924a-d6d45c64a8b8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 350
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-dbf65c8c-0c59-4e76-924a-d6d45c64a8b8"}
```
