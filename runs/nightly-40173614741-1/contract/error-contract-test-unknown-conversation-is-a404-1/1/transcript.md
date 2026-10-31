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
| 1 | `POST /v1/accounts` | 201 | 18 | `qa-f31612d3-2957-460e-a6eb-5c4aa671e42d` |
| 2 | `POST /v1/auth/token` | 200 | 21 | `qa-08686979-a2f6-4c8e-ae6c-3a3ee1b4a8e7` |
| 3 | `GET /v1/conversations/{id}/messages` | 404 | 11 | `qa-ee5b72f1-2ac4-4bf1-9104-b46c621b7e83` |
| 4 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-36e83752-b161-4ed6-896d-b87a5111998f` |
| 5 | `POST /v1/auth/token` | 401 | 26 | `qa-4c6d6fb7-3d71-480b-88c7-4bdcbbdb5bd1` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f31612d3-2957-460e-a6eb-5c4aa671e42d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f31612d3-2957-460e-a6eb-5c4aa671e42d
Content-Type: application/json

--- request body ---
{"handle":"qa-cec5344705fe","displayName":"QA cec5344705fe","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-f31612d3-2957-460e-a6eb-5c4aa671e42d
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
Location: /v1/accounts/qa-cec5344705fe
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9b880fb3-739b-4428-812b-bcf095e0ec05","handle":"qa-cec5344705fe","displayName":"QA cec5344705fe","region":"eu","role":"user","createdAt":"2026-10-25T07:40:27.447783044Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-08686979-a2f6-4c8e-ae6c-3a3ee1b4a8e7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08686979-a2f6-4c8e-ae6c-3a3ee1b4a8e7
Content-Type: application/json

--- request body ---
{"handle":"qa-cec5344705fe","password":"****"}

--- response: 200 in 21 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-08686979-a2f6-4c8e-ae6c-3a3ee1b4a8e7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 282
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9b880fb3-739b-4428-812b-bcf095e0ec05"}
```

## 3. GET /v1/conversations/{id}/messages

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist/messages
correlation: qa-ee5b72f1-2ac4-4bf1-9104-b46c621b7e83

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee5b72f1-2ac4-4bf1-9104-b46c621b7e83
Content-Type: application/json

--- response: 404 in 11 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ee5b72f1-2ac4-4bf1-9104-b46c621b7e83
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/messages","correlationId":"qa-ee5b72f1-2ac4-4bf1-9104-b46c621b7e83"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-36e83752-b161-4ed6-896d-b87a5111998f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-36e83752-b161-4ed6-896d-b87a5111998f
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: text/plain
X-Correlation-Id: qa-36e83752-b161-4ed6-896d-b87a5111998f
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
correlation: qa-4c6d6fb7-3d71-480b-88c7-4bdcbbdb5bd1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c6d6fb7-3d71-480b-88c7-4bdcbbdb5bd1
Content-Type: application/json

--- request body ---
{"handle":"qa-cec5344705fe","password":"****"}

--- response: 401 in 26 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4c6d6fb7-3d71-480b-88c7-4bdcbbdb5bd1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 280
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4c6d6fb7-3d71-480b-88c7-4bdcbbdb5bd1"}
```
