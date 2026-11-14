# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[10]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 16 | `qa-0431fd14-7811-4829-9732-141ee093e250` |
| 2 | `POST /v1/accounts` | 201 | 18 | `qa-2bc32e8a-554f-4f3b-a345-93e562919c5e` |
| 3 | `POST /v1/auth/token` | 200 | 37 | `qa-565403b4-cb7a-44a6-8345-47ed73655e17` |
| 4 | `POST /v1/conversations` | 201 | 14 | `qa-8d8c425a-df71-4f46-b9b9-6fa4a3270b33` |
| 5 | `POST /v1/conversations/{id}/messages` | 503 | 25 | `qa-f623cbda-fa85-4862-a87d-73deec7e406f` |
| 6 | `POST /v1/auth/token` | 200 | 27 | `qa-4d8300b3-2a76-4a28-8a8c-7e6663da36fd` |
| 7 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-950da1e0-859e-4ce1-93ac-068415e11151` |
| 8 | `POST /v1/auth/token` | 401 | 23 | `qa-865d9d19-51d6-4524-9dc1-758a53082374` |
| 9 | `DELETE /v1/accounts/me` | 204 | 43 | `qa-3ef76b61-5683-4512-b101-05a6e19b3da8` |
| 10 | `POST /v1/auth/token` | 401 | 14 | `qa-35c23c8d-8b18-40c3-93a8-97a96fff5c46` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0431fd14-7811-4829-9732-141ee093e250

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0431fd14-7811-4829-9732-141ee093e250
Content-Type: application/json

--- request body ---
{"handle":"qa-caf69ebe0e6d","displayName":"QA caf69ebe0e6d","password":"****","region":"eu"}

--- response: 201 in 16 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-0431fd14-7811-4829-9732-141ee093e250
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 411
RateLimit-Reset: 8
Location: /v1/accounts/qa-caf69ebe0e6d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f4f3f9ee-8e1a-4596-9ed8-6fffdab3f4c7","handle":"qa-caf69ebe0e6d","displayName":"QA caf69ebe0e6d","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.880694464Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-2bc32e8a-554f-4f3b-a345-93e562919c5e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2bc32e8a-554f-4f3b-a345-93e562919c5e
Content-Type: application/json

--- request body ---
{"handle":"qa-9fa11279007f","displayName":"QA 9fa11279007f","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-2bc32e8a-554f-4f3b-a345-93e562919c5e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 408
RateLimit-Reset: 8
Location: /v1/accounts/qa-9fa11279007f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_dc14b1c5-278a-4ef6-9558-87c6cd4a2b31","handle":"qa-9fa11279007f","displayName":"QA 9fa11279007f","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.904869562Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-565403b4-cb7a-44a6-8345-47ed73655e17

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-565403b4-cb7a-44a6-8345-47ed73655e17
Content-Type: application/json

--- request body ---
{"handle":"qa-caf69ebe0e6d","password":"****"}

--- response: 200 in 37 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-565403b4-cb7a-44a6-8345-47ed73655e17
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 400
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f4f3f9ee-8e1a-4596-9ed8-6fffdab3f4c7"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-8d8c425a-df71-4f46-b9b9-6fa4a3270b33

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8d8c425a-df71-4f46-b9b9-6fa4a3270b33
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-9fa11279007f","subject":"Error contract","message":"Hi"}

--- response: 201 in 14 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-8d8c425a-df71-4f46-b9b9-6fa4a3270b33
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
Location: /v1/conversations/cnv_265ea40b-63d7-4a36-a613-4b1675602521
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_265ea40b-63d7-4a36-a613-4b1675602521","subject":"Error contract","status":"open","region":"eu","participants":["qa-caf69ebe0e6d","qa-9fa11279007f"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-14T09:05:11.984207176Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_265ea40b-63d7-4a36-a613-4b1675602521/messages
correlation: qa-f623cbda-fa85-4862-a87d-73deec7e406f

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: bfeb0379-e602-40da-aa14-914a4e5f5b4b
X-Correlation-Id: qa-f623cbda-fa85-4862-a87d-73deec7e406f
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 503 in 25 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f623cbda-fa85-4862-a87d-73deec7e406f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 311

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_265ea40b-63d7-4a36-a613-4b1675602521/messages","correlationId":"qa-f623cbda-fa85-4862-a87d-73deec7e406f"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-4d8300b3-2a76-4a28-8a8c-7e6663da36fd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4d8300b3-2a76-4a28-8a8c-7e6663da36fd
Content-Type: application/json

--- request body ---
{"handle":"qa-9fa11279007f","password":"****"}

--- response: 200 in 27 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-4d8300b3-2a76-4a28-8a8c-7e6663da36fd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 382
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_dc14b1c5-278a-4ef6-9558-87c6cd4a2b31"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-950da1e0-859e-4ce1-93ac-068415e11151

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-950da1e0-859e-4ce1-93ac-068415e11151
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-950da1e0-859e-4ce1-93ac-068415e11151
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
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-865d9d19-51d6-4524-9dc1-758a53082374

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-865d9d19-51d6-4524-9dc1-758a53082374
Content-Type: application/json

--- request body ---
{"handle":"qa-9fa11279007f","password":"****"}

--- response: 401 in 23 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-865d9d19-51d6-4524-9dc1-758a53082374
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 371
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-865d9d19-51d6-4524-9dc1-758a53082374"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3ef76b61-5683-4512-b101-05a6e19b3da8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3ef76b61-5683-4512-b101-05a6e19b3da8
Content-Type: application/json

--- response: 204 in 43 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3ef76b61-5683-4512-b101-05a6e19b3da8
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

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-35c23c8d-8b18-40c3-93a8-97a96fff5c46

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35c23c8d-8b18-40c3-93a8-97a96fff5c46
Content-Type: application/json

--- request body ---
{"handle":"qa-caf69ebe0e6d","password":"****"}

--- response: 401 in 14 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-35c23c8d-8b18-40c3-93a8-97a96fff5c46
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 362
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-35c23c8d-8b18-40c3-93a8-97a96fff5c46"}
```
