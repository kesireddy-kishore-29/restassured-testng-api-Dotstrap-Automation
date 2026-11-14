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
| 1 | `POST /v1/accounts` | 201 | 14 | `qa-35f9bfc7-cb28-4359-9b7b-3b5a89238286` |
| 2 | `POST /v1/auth/token` | 200 | 14 | `qa-4244879d-41c6-4464-b457-538f49324cf6` |
| 3 | `POST /v1/conversations/{id}/messages` | 404 | 11 | `qa-5dec4ca1-85f6-4208-bcdb-c2f01b980270` |
| 4 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-45b5e561-38cb-4e57-9b61-6dd4934bbabb` |
| 5 | `POST /v1/auth/token` | 401 | 6 | `qa-72c3991f-a28d-4778-8e97-3873aaeb8d5f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-35f9bfc7-cb28-4359-9b7b-3b5a89238286

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35f9bfc7-cb28-4359-9b7b-3b5a89238286
Content-Type: application/json

--- request body ---
{"handle":"qa-04b624249ab5","displayName":"QA 04b624249ab5","password":"****","region":"eu"}

--- response: 201 in 14 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-35f9bfc7-cb28-4359-9b7b-3b5a89238286
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 287
RateLimit-Reset: 7
Location: /v1/accounts/qa-04b624249ab5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_79b9ebce-136f-4121-869e-a813e4a15c2c","handle":"qa-04b624249ab5","displayName":"QA 04b624249ab5","region":"eu","role":"user","createdAt":"2026-11-10T09:59:37.903919714Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-4244879d-41c6-4464-b457-538f49324cf6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4244879d-41c6-4464-b457-538f49324cf6
Content-Type: application/json

--- request body ---
{"handle":"qa-04b624249ab5","password":"****"}

--- response: 200 in 14 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-4244879d-41c6-4464-b457-538f49324cf6
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_79b9ebce-136f-4121-869e-a813e4a15c2c"}
```

## 3. POST /v1/conversations/{id}/messages

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/messages
correlation: qa-5dec4ca1-85f6-4208-bcdb-c2f01b980270

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5dec4ca1-85f6-4208-bcdb-c2f01b980270
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 404 in 11 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5dec4ca1-85f6-4208-bcdb-c2f01b980270
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/messages","correlationId":"qa-5dec4ca1-85f6-4208-bcdb-c2f01b980270"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-45b5e561-38cb-4e57-9b61-6dd4934bbabb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-45b5e561-38cb-4e57-9b61-6dd4934bbabb
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-45b5e561-38cb-4e57-9b61-6dd4934bbabb
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
correlation: qa-72c3991f-a28d-4778-8e97-3873aaeb8d5f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-72c3991f-a28d-4778-8e97-3873aaeb8d5f
Content-Type: application/json

--- request body ---
{"handle":"qa-04b624249ab5","password":"****"}

--- response: 401 in 6 ms ---
Date: Tue, 10 Nov 2026 09:59:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-72c3991f-a28d-4778-8e97-3873aaeb8d5f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 278
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-72c3991f-a28d-4778-8e97-3873aaeb8d5f"}
```
