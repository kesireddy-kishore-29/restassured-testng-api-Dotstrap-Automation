# Transcript: Every conversation operation answers an unknown id with a 404 problem [POST /v1/conversations/{id}/close]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#unknownConversationIsA404[4]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 14 | `qa-97c8e7ea-8ea8-456a-bccd-f346e6123f69` |
| 2 | `POST /v1/auth/token` | 200 | 14 | `qa-6909ee84-f0ee-4844-8895-de5bf460819b` |
| 3 | `POST /v1/conversations/{id}/close` | 404 | 6 | `qa-fe63b211-02fe-4478-b0d7-621b45227819` |
| 4 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-3585de34-52d7-4e79-8315-e3f8802e453b` |
| 5 | `POST /v1/auth/token` | 401 | 8 | `qa-46d24bb9-7e13-4813-aa12-90ec7e5b138d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-97c8e7ea-8ea8-456a-bccd-f346e6123f69

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-97c8e7ea-8ea8-456a-bccd-f346e6123f69
Content-Type: application/json

--- request body ---
{"handle":"qa-2260d1b625dc","displayName":"QA 2260d1b625dc","password":"****","region":"eu"}

--- response: 201 in 14 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-97c8e7ea-8ea8-456a-bccd-f346e6123f69
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 276
RateLimit-Reset: 7
Location: /v1/accounts/qa-2260d1b625dc
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f818b771-e3f1-489a-b870-43474cb601ee","handle":"qa-2260d1b625dc","displayName":"QA 2260d1b625dc","region":"eu","role":"user","createdAt":"2026-10-26T07:54:49.254929756Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-6909ee84-f0ee-4844-8895-de5bf460819b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6909ee84-f0ee-4844-8895-de5bf460819b
Content-Type: application/json

--- request body ---
{"handle":"qa-2260d1b625dc","password":"****"}

--- response: 200 in 14 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-6909ee84-f0ee-4844-8895-de5bf460819b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 275
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f818b771-e3f1-489a-b870-43474cb601ee"}
```

## 3. POST /v1/conversations/{id}/close

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/close
correlation: qa-fe63b211-02fe-4478-b0d7-621b45227819

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fe63b211-02fe-4478-b0d7-621b45227819
Content-Type: application/json

--- response: 404 in 6 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fe63b211-02fe-4478-b0d7-621b45227819
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
Content-Length: 259

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/close","correlationId":"qa-fe63b211-02fe-4478-b0d7-621b45227819"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3585de34-52d7-4e79-8315-e3f8802e453b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3585de34-52d7-4e79-8315-e3f8802e453b
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3585de34-52d7-4e79-8315-e3f8802e453b
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
correlation: qa-46d24bb9-7e13-4813-aa12-90ec7e5b138d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-46d24bb9-7e13-4813-aa12-90ec7e5b138d
Content-Type: application/json

--- request body ---
{"handle":"qa-2260d1b625dc","password":"****"}

--- response: 401 in 8 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-46d24bb9-7e13-4813-aa12-90ec7e5b138d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 271
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-46d24bb9-7e13-4813-aa12-90ec7e5b138d"}
```
