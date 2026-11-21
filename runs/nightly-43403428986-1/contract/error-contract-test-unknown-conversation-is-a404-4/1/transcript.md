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
| 1 | `POST /v1/accounts` | 201 | 10 | `qa-5e0f68da-7009-4854-aaf9-73b05dd03b79` |
| 2 | `POST /v1/auth/token` | 200 | 20 | `qa-1cbd8304-b1c6-4f7b-bee2-81d16a697646` |
| 3 | `POST /v1/conversations/{id}/close` | 404 | 6 | `qa-67dd96b2-ef1f-41c7-93de-aae8150677b7` |
| 4 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-e793e3ed-a67a-4b13-921b-d6bdb605d1d3` |
| 5 | `POST /v1/auth/token` | 401 | 11 | `qa-d288b89f-dbca-4133-9f1e-dda821d69ea6` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5e0f68da-7009-4854-aaf9-73b05dd03b79

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e0f68da-7009-4854-aaf9-73b05dd03b79
Content-Type: application/json

--- request body ---
{"handle":"qa-6c606323e73b","displayName":"QA 6c606323e73b","password":"****","region":"eu"}

--- response: 201 in 10 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-5e0f68da-7009-4854-aaf9-73b05dd03b79
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 277
RateLimit-Reset: 6
Location: /v1/accounts/qa-6c606323e73b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_cb91ed2c-a841-4889-9281-6f2c5e1d7c9a","handle":"qa-6c606323e73b","displayName":"QA 6c606323e73b","region":"eu","role":"user","createdAt":"2026-11-13T09:42:08.936792717Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-1cbd8304-b1c6-4f7b-bee2-81d16a697646

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1cbd8304-b1c6-4f7b-bee2-81d16a697646
Content-Type: application/json

--- request body ---
{"handle":"qa-6c606323e73b","password":"****"}

--- response: 200 in 20 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-1cbd8304-b1c6-4f7b-bee2-81d16a697646
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 275
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cb91ed2c-a841-4889-9281-6f2c5e1d7c9a"}
```

## 3. POST /v1/conversations/{id}/close

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/close
correlation: qa-67dd96b2-ef1f-41c7-93de-aae8150677b7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-67dd96b2-ef1f-41c7-93de-aae8150677b7
Content-Type: application/json

--- response: 404 in 6 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-67dd96b2-ef1f-41c7-93de-aae8150677b7
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/close","correlationId":"qa-67dd96b2-ef1f-41c7-93de-aae8150677b7"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e793e3ed-a67a-4b13-921b-d6bdb605d1d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e793e3ed-a67a-4b13-921b-d6bdb605d1d3
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Fri, 13 Nov 2026 09:42:09 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e793e3ed-a67a-4b13-921b-d6bdb605d1d3
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
correlation: qa-d288b89f-dbca-4133-9f1e-dda821d69ea6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d288b89f-dbca-4133-9f1e-dda821d69ea6
Content-Type: application/json

--- request body ---
{"handle":"qa-6c606323e73b","password":"****"}

--- response: 401 in 11 ms ---
Date: Fri, 13 Nov 2026 09:42:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d288b89f-dbca-4133-9f1e-dda821d69ea6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 273
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d288b89f-dbca-4133-9f1e-dda821d69ea6"}
```
