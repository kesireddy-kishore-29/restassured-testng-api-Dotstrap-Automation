# Transcript: Every conversation operation answers an unknown id with a 404 problem [GET /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#unknownConversationIsA404[1]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 33 | `qa-e9c3136a-94d7-4c80-ad6d-e13a655c5297` |
| 2 | `POST /v1/auth/token` | 200 | 22 | `qa-5473c57e-7bc9-4619-8acd-b255793e383f` |
| 3 | `GET /v1/conversations/{id}/messages` | 404 | 17 | `qa-2abd42d5-b9b4-4e96-b6d7-8213d5a2923d` |
| 4 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-4b1b8510-b594-4aa2-bafc-a8bac0852df3` |
| 5 | `POST /v1/auth/token` | 401 | 7 | `qa-0be35e33-f85f-4eff-bac3-a086a8acdcbe` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e9c3136a-94d7-4c80-ad6d-e13a655c5297

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e9c3136a-94d7-4c80-ad6d-e13a655c5297
Content-Type: application/json

--- request body ---
{"handle":"qa-57b73eee5fe1","displayName":"QA 57b73eee5fe1","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-e9c3136a-94d7-4c80-ad6d-e13a655c5297
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 286
RateLimit-Reset: 7
Location: /v1/accounts/qa-57b73eee5fe1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a65e6fc0-6f36-4e47-9ce5-3636a371ba23","handle":"qa-57b73eee5fe1","displayName":"QA 57b73eee5fe1","region":"eu","role":"user","createdAt":"2026-11-10T09:59:37.923413325Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-5473c57e-7bc9-4619-8acd-b255793e383f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5473c57e-7bc9-4619-8acd-b255793e383f
Content-Type: application/json

--- request body ---
{"handle":"qa-57b73eee5fe1","password":"****"}

--- response: 200 in 22 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-5473c57e-7bc9-4619-8acd-b255793e383f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 281
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a65e6fc0-6f36-4e47-9ce5-3636a371ba23"}
```

## 3. GET /v1/conversations/{id}/messages

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist/messages
correlation: qa-2abd42d5-b9b4-4e96-b6d7-8213d5a2923d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2abd42d5-b9b4-4e96-b6d7-8213d5a2923d
Content-Type: application/json

--- response: 404 in 17 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2abd42d5-b9b4-4e96-b6d7-8213d5a2923d
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/messages","correlationId":"qa-2abd42d5-b9b4-4e96-b6d7-8213d5a2923d"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4b1b8510-b594-4aa2-bafc-a8bac0852df3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4b1b8510-b594-4aa2-bafc-a8bac0852df3
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Tue, 10 Nov 2026 09:59:38 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4b1b8510-b594-4aa2-bafc-a8bac0852df3
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
correlation: qa-0be35e33-f85f-4eff-bac3-a086a8acdcbe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0be35e33-f85f-4eff-bac3-a086a8acdcbe
Content-Type: application/json

--- request body ---
{"handle":"qa-57b73eee5fe1","password":"****"}

--- response: 401 in 7 ms ---
Date: Tue, 10 Nov 2026 09:59:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0be35e33-f85f-4eff-bac3-a086a8acdcbe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 272
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0be35e33-f85f-4eff-bac3-a086a8acdcbe"}
```
