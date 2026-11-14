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
| 1 | `POST /v1/accounts` | 201 | 11 | `qa-a1f6a7f4-0324-4695-8047-c498159ad99f` |
| 2 | `POST /v1/auth/token` | 200 | 13 | `qa-d10ee4e2-7833-40fe-bc8a-f4b4bb275898` |
| 3 | `POST /v1/conversations/{id}/messages` | 404 | 9 | `qa-dca602b1-3ae7-4715-b253-84b38fb3f163` |
| 4 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-4842234a-1723-42f0-a60f-73f5b90d0548` |
| 5 | `POST /v1/auth/token` | 401 | 11 | `qa-3f9cba4f-9d5f-4da7-9d57-cead7e4f8337` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a1f6a7f4-0324-4695-8047-c498159ad99f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a1f6a7f4-0324-4695-8047-c498159ad99f
Content-Type: application/json

--- request body ---
{"handle":"qa-5b4d26f06c4c","displayName":"QA 5b4d26f06c4c","password":"****","region":"eu"}

--- response: 201 in 11 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-a1f6a7f4-0324-4695-8047-c498159ad99f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 288
RateLimit-Reset: 7
Location: /v1/accounts/qa-5b4d26f06c4c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6863c75b-82c7-4d42-9b99-66370704442b","handle":"qa-5b4d26f06c4c","displayName":"QA 5b4d26f06c4c","region":"eu","role":"user","createdAt":"2026-11-09T09:56:04.163120709Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-d10ee4e2-7833-40fe-bc8a-f4b4bb275898

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d10ee4e2-7833-40fe-bc8a-f4b4bb275898
Content-Type: application/json

--- request body ---
{"handle":"qa-5b4d26f06c4c","password":"****"}

--- response: 200 in 13 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-d10ee4e2-7833-40fe-bc8a-f4b4bb275898
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 283
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6863c75b-82c7-4d42-9b99-66370704442b"}
```

## 3. POST /v1/conversations/{id}/messages

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/messages
correlation: qa-dca602b1-3ae7-4715-b253-84b38fb3f163

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dca602b1-3ae7-4715-b253-84b38fb3f163
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 404 in 9 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dca602b1-3ae7-4715-b253-84b38fb3f163
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/messages","correlationId":"qa-dca602b1-3ae7-4715-b253-84b38fb3f163"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4842234a-1723-42f0-a60f-73f5b90d0548

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4842234a-1723-42f0-a60f-73f5b90d0548
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4842234a-1723-42f0-a60f-73f5b90d0548
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
correlation: qa-3f9cba4f-9d5f-4da7-9d57-cead7e4f8337

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f9cba4f-9d5f-4da7-9d57-cead7e4f8337
Content-Type: application/json

--- request body ---
{"handle":"qa-5b4d26f06c4c","password":"****"}

--- response: 401 in 11 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3f9cba4f-9d5f-4da7-9d57-cead7e4f8337
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3f9cba4f-9d5f-4da7-9d57-cead7e4f8337"}
```
