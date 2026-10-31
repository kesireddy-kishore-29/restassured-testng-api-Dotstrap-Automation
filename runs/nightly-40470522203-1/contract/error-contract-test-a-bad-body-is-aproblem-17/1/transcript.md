# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/credits/purchases, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[17]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 27 | `qa-3ce25b98-2080-4aa4-9157-3f43cac73cc6` |
| 2 | `POST /v1/accounts` | 201 | 19 | `qa-2ea978eb-4258-41bb-ba10-c94686a623d6` |
| 3 | `POST /v1/auth/token` | 200 | 18 | `qa-b62e59c9-40a1-4551-8e1f-e2fe48693acd` |
| 4 | `POST /v1/conversations` | 201 | 20 | `qa-5768bd87-1e22-4a66-a333-f59deb9bee8d` |
| 5 | `POST /v1/credits/purchases` | 422 | 14 | `qa-7cf7ad0c-271e-4b0e-b73d-a1b6a88c7330` |
| 6 | `POST /v1/auth/token` | 200 | 25 | `qa-1c9efa0c-59b0-4aa0-b533-7b94e4bd8cd0` |
| 7 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-c22cad49-3a25-4a28-bd63-36a0f7abc048` |
| 8 | `POST /v1/auth/token` | 401 | 10 | `qa-bf03af49-e6da-4e4e-9a9d-78a72cee904b` |
| 9 | `DELETE /v1/accounts/me` | 204 | 26 | `qa-82cf210c-4b1c-40b9-9833-c4845ca52e5c` |
| 10 | `POST /v1/auth/token` | 401 | 18 | `qa-a8acf9a6-604e-4e03-83a1-5038479a4d95` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3ce25b98-2080-4aa4-9157-3f43cac73cc6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3ce25b98-2080-4aa4-9157-3f43cac73cc6
Content-Type: application/json

--- request body ---
{"handle":"qa-df8101414e28","displayName":"QA df8101414e28","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-3ce25b98-2080-4aa4-9157-3f43cac73cc6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 309
RateLimit-Reset: 6
Location: /v1/accounts/qa-df8101414e28
X-Served-Region: eu
Content-Length: 181

{"id":"acc_87339ab1-d1b2-41a3-8611-705727f41bb1","handle":"qa-df8101414e28","displayName":"QA df8101414e28","region":"eu","role":"user","createdAt":"2026-10-27T08:00:35.874216208Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-2ea978eb-4258-41bb-ba10-c94686a623d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2ea978eb-4258-41bb-ba10-c94686a623d6
Content-Type: application/json

--- request body ---
{"handle":"qa-ac8494e163a9","displayName":"QA ac8494e163a9","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-2ea978eb-4258-41bb-ba10-c94686a623d6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 306
RateLimit-Reset: 6
Location: /v1/accounts/qa-ac8494e163a9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4a8025b9-3b77-42e0-a584-bab6e79e6643","handle":"qa-ac8494e163a9","displayName":"QA ac8494e163a9","region":"eu","role":"user","createdAt":"2026-10-27T08:00:35.898386641Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-b62e59c9-40a1-4551-8e1f-e2fe48693acd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b62e59c9-40a1-4551-8e1f-e2fe48693acd
Content-Type: application/json

--- request body ---
{"handle":"qa-df8101414e28","password":"****"}

--- response: 200 in 18 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-b62e59c9-40a1-4551-8e1f-e2fe48693acd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 304
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_87339ab1-d1b2-41a3-8611-705727f41bb1"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-5768bd87-1e22-4a66-a333-f59deb9bee8d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5768bd87-1e22-4a66-a333-f59deb9bee8d
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-ac8494e163a9","subject":"Error contract","message":"Hi"}

--- response: 201 in 20 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-5768bd87-1e22-4a66-a333-f59deb9bee8d
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
Location: /v1/conversations/cnv_cf026a7b-b070-4dbc-91b1-4390b38f1aaa
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_cf026a7b-b070-4dbc-91b1-4390b38f1aaa","subject":"Error contract","status":"open","region":"eu","participants":["qa-df8101414e28","qa-ac8494e163a9"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-27T08:00:35.954833838Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-7cf7ad0c-271e-4b0e-b73d-a1b6a88c7330

--- request headers ---
Accept: application/json
Idempotency-Key: qa-8831926f8052433aac98c407daa87b95
X-Correlation-Id: qa-7cf7ad0c-271e-4b0e-b73d-a1b6a88c7330
Content-Type: application/json

--- request body ---
{"packId":"pack-0"}

--- response: 422 in 14 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7cf7ad0c-271e-4b0e-b73d-a1b6a88c7330
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/credits/purchases","correlationId":"qa-7cf7ad0c-271e-4b0e-b73d-a1b6a88c7330","errors":[{"field":"packId","message":"one of: pack-10, pack-50"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-1c9efa0c-59b0-4aa0-b533-7b94e4bd8cd0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1c9efa0c-59b0-4aa0-b533-7b94e4bd8cd0
Content-Type: application/json

--- request body ---
{"handle":"qa-ac8494e163a9","password":"****"}

--- response: 200 in 25 ms ---
Date: Tue, 27 Oct 2026 08:00:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-1c9efa0c-59b0-4aa0-b533-7b94e4bd8cd0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 293
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4a8025b9-3b77-42e0-a584-bab6e79e6643"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c22cad49-3a25-4a28-bd63-36a0f7abc048

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c22cad49-3a25-4a28-bd63-36a0f7abc048
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Tue, 27 Oct 2026 08:00:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c22cad49-3a25-4a28-bd63-36a0f7abc048
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
correlation: qa-bf03af49-e6da-4e4e-9a9d-78a72cee904b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf03af49-e6da-4e4e-9a9d-78a72cee904b
Content-Type: application/json

--- request body ---
{"handle":"qa-ac8494e163a9","password":"****"}

--- response: 401 in 10 ms ---
Date: Tue, 27 Oct 2026 08:00:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bf03af49-e6da-4e4e-9a9d-78a72cee904b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 290
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bf03af49-e6da-4e4e-9a9d-78a72cee904b"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-82cf210c-4b1c-40b9-9833-c4845ca52e5c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-82cf210c-4b1c-40b9-9833-c4845ca52e5c
Content-Type: application/json

--- response: 204 in 26 ms ---
Date: Tue, 27 Oct 2026 08:00:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-82cf210c-4b1c-40b9-9833-c4845ca52e5c
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
correlation: qa-a8acf9a6-604e-4e03-83a1-5038479a4d95

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a8acf9a6-604e-4e03-83a1-5038479a4d95
Content-Type: application/json

--- request body ---
{"handle":"qa-df8101414e28","password":"****"}

--- response: 401 in 18 ms ---
Date: Tue, 27 Oct 2026 08:00:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a8acf9a6-604e-4e03-83a1-5038479a4d95
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 283
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a8acf9a6-604e-4e03-83a1-5038479a4d95"}
```
