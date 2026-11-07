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
| 1 | `POST /v1/accounts` | 201 | 38 | `qa-e80ece6e-24d2-434d-a835-7577e0994e1c` |
| 2 | `POST /v1/auth/token` | 200 | 28 | `qa-69a51f82-fb5b-4a64-8845-270e564f9f99` |
| 3 | `POST /v1/conversations/{id}/messages` | 404 | 12 | `qa-90f6480e-d0e4-497b-83c4-ff79d6640988` |
| 4 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-a8c4d7b9-4ecc-4ceb-947d-318dbb2bdae5` |
| 5 | `POST /v1/auth/token` | 401 | 12 | `qa-d13fa4ba-de1e-4d51-ab34-23a45a051bd7` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e80ece6e-24d2-434d-a835-7577e0994e1c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e80ece6e-24d2-434d-a835-7577e0994e1c
Content-Type: application/json

--- request body ---
{"handle":"qa-146d2ada6662","displayName":"QA 146d2ada6662","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-e80ece6e-24d2-434d-a835-7577e0994e1c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 310
RateLimit-Reset: 6
Location: /v1/accounts/qa-146d2ada6662
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b05b7a96-0b3d-43b3-8ff8-606b4e6b8779","handle":"qa-146d2ada6662","displayName":"QA 146d2ada6662","region":"eu","role":"user","createdAt":"2026-10-31T08:31:37.132320756Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-69a51f82-fb5b-4a64-8845-270e564f9f99

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-69a51f82-fb5b-4a64-8845-270e564f9f99
Content-Type: application/json

--- request body ---
{"handle":"qa-146d2ada6662","password":"****"}

--- response: 200 in 28 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-69a51f82-fb5b-4a64-8845-270e564f9f99
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 302
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b05b7a96-0b3d-43b3-8ff8-606b4e6b8779"}
```

## 3. POST /v1/conversations/{id}/messages

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/messages
correlation: qa-90f6480e-d0e4-497b-83c4-ff79d6640988

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-90f6480e-d0e4-497b-83c4-ff79d6640988
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 404 in 12 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-90f6480e-d0e4-497b-83c4-ff79d6640988
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/messages","correlationId":"qa-90f6480e-d0e4-497b-83c4-ff79d6640988"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a8c4d7b9-4ecc-4ceb-947d-318dbb2bdae5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a8c4d7b9-4ecc-4ceb-947d-318dbb2bdae5
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a8c4d7b9-4ecc-4ceb-947d-318dbb2bdae5
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
correlation: qa-d13fa4ba-de1e-4d51-ab34-23a45a051bd7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d13fa4ba-de1e-4d51-ab34-23a45a051bd7
Content-Type: application/json

--- request body ---
{"handle":"qa-146d2ada6662","password":"****"}

--- response: 401 in 12 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d13fa4ba-de1e-4d51-ab34-23a45a051bd7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 288
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d13fa4ba-de1e-4d51-ab34-23a45a051bd7"}
```
