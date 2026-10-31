# Transcript: Every conversation operation answers an unknown id with a 404 problem [POST /v1/conversations/{id}/read]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#unknownConversationIsA404[3]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 32 | `qa-7c545450-d44d-4ed1-a4b1-028574d244b6` |
| 2 | `POST /v1/auth/token` | 200 | 8 | `qa-85edda35-8144-4e81-81de-79e30355963c` |
| 3 | `POST /v1/conversations/{id}/read` | 404 | 15 | `qa-e5ca66ec-25a8-4a87-9640-8a8a60474436` |
| 4 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-79054275-ed40-4b9c-93bb-e767eb742006` |
| 5 | `POST /v1/auth/token` | 401 | 15 | `qa-36f1064b-123a-4217-a1fc-499e15ad7e81` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-7c545450-d44d-4ed1-a4b1-028574d244b6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c545450-d44d-4ed1-a4b1-028574d244b6
Content-Type: application/json

--- request body ---
{"handle":"qa-9e61e29107ca","displayName":"QA 9e61e29107ca","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-7c545450-d44d-4ed1-a4b1-028574d244b6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 288
RateLimit-Reset: 5
Location: /v1/accounts/qa-9e61e29107ca
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f59330d8-846b-4d62-bbc0-567f6a653c7d","handle":"qa-9e61e29107ca","displayName":"QA 9e61e29107ca","region":"eu","role":"user","createdAt":"2026-10-23T07:41:47.681084302Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-85edda35-8144-4e81-81de-79e30355963c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-85edda35-8144-4e81-81de-79e30355963c
Content-Type: application/json

--- request body ---
{"handle":"qa-9e61e29107ca","password":"****"}

--- response: 200 in 8 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-85edda35-8144-4e81-81de-79e30355963c
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f59330d8-846b-4d62-bbc0-567f6a653c7d"}
```

## 3. POST /v1/conversations/{id}/read

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/read
correlation: qa-e5ca66ec-25a8-4a87-9640-8a8a60474436

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e5ca66ec-25a8-4a87-9640-8a8a60474436
Content-Type: application/json

--- response: 404 in 15 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e5ca66ec-25a8-4a87-9640-8a8a60474436
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
Content-Length: 258

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/read","correlationId":"qa-e5ca66ec-25a8-4a87-9640-8a8a60474436"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-79054275-ed40-4b9c-93bb-e767eb742006

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-79054275-ed40-4b9c-93bb-e767eb742006
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-79054275-ed40-4b9c-93bb-e767eb742006
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
correlation: qa-36f1064b-123a-4217-a1fc-499e15ad7e81

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-36f1064b-123a-4217-a1fc-499e15ad7e81
Content-Type: application/json

--- request body ---
{"handle":"qa-9e61e29107ca","password":"****"}

--- response: 401 in 15 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-36f1064b-123a-4217-a1fc-499e15ad7e81
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 280
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-36f1064b-123a-4217-a1fc-499e15ad7e81"}
```
