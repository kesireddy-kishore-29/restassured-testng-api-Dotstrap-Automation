# Transcript: Every conversation operation answers an unknown id with a 404 problem [POST /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#unknownConversationIsA404[2]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 24 | `qa-54080bb5-67f4-456a-8edd-f3a0a51e0421` |
| 2 | `POST /v1/auth/token` | 200 | 13 | `qa-10f61c70-d81a-4ec9-8801-64fb7c161dbc` |
| 3 | `POST /v1/conversations/{id}/messages` | 404 | 6 | `qa-b68d6753-1b4a-49b1-bd8f-484d9a4ad961` |
| 4 | `DELETE /v1/accounts/me` | 204 | 2 | `qa-77dad134-9568-4017-b5ed-e3c30acdeb4c` |
| 5 | `POST /v1/auth/token` | 401 | 17 | `qa-fc9e2da1-e9d0-4613-b36e-e788ac4e5be6` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-54080bb5-67f4-456a-8edd-f3a0a51e0421

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-54080bb5-67f4-456a-8edd-f3a0a51e0421
Content-Type: application/json

--- request body ---
{"handle":"qa-d3e397e28c5b","displayName":"QA d3e397e28c5b","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-54080bb5-67f4-456a-8edd-f3a0a51e0421
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 290
RateLimit-Reset: 7
Location: /v1/accounts/qa-d3e397e28c5b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e46558b9-6a9a-4231-97cc-452d5bb6ea5c","handle":"qa-d3e397e28c5b","displayName":"QA d3e397e28c5b","region":"eu","role":"user","createdAt":"2026-11-22T09:54:42.623465650Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-10f61c70-d81a-4ec9-8801-64fb7c161dbc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-10f61c70-d81a-4ec9-8801-64fb7c161dbc
Content-Type: application/json

--- request body ---
{"handle":"qa-d3e397e28c5b","password":"****"}

--- response: 200 in 13 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-10f61c70-d81a-4ec9-8801-64fb7c161dbc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 285
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e46558b9-6a9a-4231-97cc-452d5bb6ea5c"}
```

## 3. POST /v1/conversations/{id}/messages

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/messages
correlation: qa-b68d6753-1b4a-49b1-bd8f-484d9a4ad961

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b68d6753-1b4a-49b1-bd8f-484d9a4ad961
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 404 in 6 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b68d6753-1b4a-49b1-bd8f-484d9a4ad961
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
Content-Length: 262

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/messages","correlationId":"qa-b68d6753-1b4a-49b1-bd8f-484d9a4ad961"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-77dad134-9568-4017-b5ed-e3c30acdeb4c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-77dad134-9568-4017-b5ed-e3c30acdeb4c
Content-Type: application/json

--- response: 204 in 2 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: text/plain
X-Correlation-Id: qa-77dad134-9568-4017-b5ed-e3c30acdeb4c
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
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-fc9e2da1-e9d0-4613-b36e-e788ac4e5be6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc9e2da1-e9d0-4613-b36e-e788ac4e5be6
Content-Type: application/json

--- request body ---
{"handle":"qa-d3e397e28c5b","password":"****"}

--- response: 401 in 17 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fc9e2da1-e9d0-4613-b36e-e788ac4e5be6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 279
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fc9e2da1-e9d0-4613-b36e-e788ac4e5be6"}
```
