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
| 1 | `POST /v1/accounts` | 201 | 36 | `qa-7cabf266-369c-48da-aa46-966383817495` |
| 2 | `POST /v1/auth/token` | 200 | 23 | `qa-2031a80b-cb60-4cd8-b726-221d385cb719` |
| 3 | `POST /v1/conversations/{id}/messages` | 404 | 21 | `qa-a6fbced7-b099-47b6-8e18-ec3b2e946ac6` |
| 4 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-a1844dd7-40b2-42c0-94b8-43bb7019acad` |
| 5 | `POST /v1/auth/token` | 401 | 8 | `qa-231970e8-412e-4888-9b4d-35d581b3b570` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-7cabf266-369c-48da-aa46-966383817495

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7cabf266-369c-48da-aa46-966383817495
Content-Type: application/json

--- request body ---
{"handle":"qa-047dceb944d5","displayName":"QA 047dceb944d5","password":"****","region":"eu"}

--- response: 201 in 36 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-7cabf266-369c-48da-aa46-966383817495
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 311
RateLimit-Reset: 7
Location: /v1/accounts/qa-047dceb944d5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e38cbace-bf0e-4ac6-ab3c-f6709570c85a","handle":"qa-047dceb944d5","displayName":"QA 047dceb944d5","region":"eu","role":"user","createdAt":"2026-11-02T09:38:37.946900704Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-2031a80b-cb60-4cd8-b726-221d385cb719

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2031a80b-cb60-4cd8-b726-221d385cb719
Content-Type: application/json

--- request body ---
{"handle":"qa-047dceb944d5","password":"****"}

--- response: 200 in 23 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-2031a80b-cb60-4cd8-b726-221d385cb719
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 303
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e38cbace-bf0e-4ac6-ab3c-f6709570c85a"}
```

## 3. POST /v1/conversations/{id}/messages

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/messages
correlation: qa-a6fbced7-b099-47b6-8e18-ec3b2e946ac6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a6fbced7-b099-47b6-8e18-ec3b2e946ac6
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 404 in 21 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a6fbced7-b099-47b6-8e18-ec3b2e946ac6
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/messages","correlationId":"qa-a6fbced7-b099-47b6-8e18-ec3b2e946ac6"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a1844dd7-40b2-42c0-94b8-43bb7019acad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a1844dd7-40b2-42c0-94b8-43bb7019acad
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a1844dd7-40b2-42c0-94b8-43bb7019acad
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
correlation: qa-231970e8-412e-4888-9b4d-35d581b3b570

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-231970e8-412e-4888-9b4d-35d581b3b570
Content-Type: application/json

--- request body ---
{"handle":"qa-047dceb944d5","password":"****"}

--- response: 401 in 8 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-231970e8-412e-4888-9b4d-35d581b3b570
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 293
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-231970e8-412e-4888-9b4d-35d581b3b570"}
```
