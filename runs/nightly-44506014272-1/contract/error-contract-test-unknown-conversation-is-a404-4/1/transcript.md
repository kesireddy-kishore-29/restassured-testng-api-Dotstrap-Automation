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
| 1 | `POST /v1/accounts` | 201 | 21 | `qa-35b97554-54cd-44f5-a9f0-e547771caaf1` |
| 2 | `POST /v1/auth/token` | 200 | 7 | `qa-32d1288f-6ba2-4053-a1d9-29ac8201bb45` |
| 3 | `POST /v1/conversations/{id}/close` | 404 | 9 | `qa-d2ba0793-ce1c-4ca5-ad36-3e92bc3280af` |
| 4 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-97a35322-8444-45a1-b315-7e43ed63e09c` |
| 5 | `POST /v1/auth/token` | 401 | 4 | `qa-e73d85d3-e39d-480e-b391-f54e1ae65e4f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-35b97554-54cd-44f5-a9f0-e547771caaf1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35b97554-54cd-44f5-a9f0-e547771caaf1
Content-Type: application/json

--- request body ---
{"handle":"qa-63ccb138dc00","displayName":"QA 63ccb138dc00","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Thu, 19 Nov 2026 10:29:28 GMT
Content-Type: application/json
X-Correlation-Id: qa-35b97554-54cd-44f5-a9f0-e547771caaf1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 277
RateLimit-Reset: 5
Location: /v1/accounts/qa-63ccb138dc00
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a6372f69-d63b-4ae3-aec0-55ad1b1f83b0","handle":"qa-63ccb138dc00","displayName":"QA 63ccb138dc00","region":"eu","role":"user","createdAt":"2026-11-19T10:29:28.115376415Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-32d1288f-6ba2-4053-a1d9-29ac8201bb45

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-32d1288f-6ba2-4053-a1d9-29ac8201bb45
Content-Type: application/json

--- request body ---
{"handle":"qa-63ccb138dc00","password":"****"}

--- response: 200 in 7 ms ---
Date: Thu, 19 Nov 2026 10:29:28 GMT
Content-Type: application/json
X-Correlation-Id: qa-32d1288f-6ba2-4053-a1d9-29ac8201bb45
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 275
RateLimit-Reset: 5
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a6372f69-d63b-4ae3-aec0-55ad1b1f83b0"}
```

## 3. POST /v1/conversations/{id}/close

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/close
correlation: qa-d2ba0793-ce1c-4ca5-ad36-3e92bc3280af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d2ba0793-ce1c-4ca5-ad36-3e92bc3280af
Content-Type: application/json

--- response: 404 in 9 ms ---
Date: Thu, 19 Nov 2026 10:29:28 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d2ba0793-ce1c-4ca5-ad36-3e92bc3280af
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/close","correlationId":"qa-d2ba0793-ce1c-4ca5-ad36-3e92bc3280af"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-97a35322-8444-45a1-b315-7e43ed63e09c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-97a35322-8444-45a1-b315-7e43ed63e09c
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Thu, 19 Nov 2026 10:29:28 GMT
Content-Type: text/plain
X-Correlation-Id: qa-97a35322-8444-45a1-b315-7e43ed63e09c
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
correlation: qa-e73d85d3-e39d-480e-b391-f54e1ae65e4f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e73d85d3-e39d-480e-b391-f54e1ae65e4f
Content-Type: application/json

--- request body ---
{"handle":"qa-63ccb138dc00","password":"****"}

--- response: 401 in 4 ms ---
Date: Thu, 19 Nov 2026 10:29:28 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e73d85d3-e39d-480e-b391-f54e1ae65e4f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 271
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e73d85d3-e39d-480e-b391-f54e1ae65e4f"}
```
