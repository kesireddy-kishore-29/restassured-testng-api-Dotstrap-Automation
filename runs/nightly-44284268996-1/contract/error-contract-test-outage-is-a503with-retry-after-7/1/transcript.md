# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/conversations]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[7]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 22 | `qa-89b30259-71a6-461f-99a4-40d23dbcf511` |
| 2 | `POST /v1/accounts` | 201 | 19 | `qa-1e401244-b019-4a78-bee0-bcc3c9443acc` |
| 3 | `POST /v1/auth/token` | 200 | 27 | `qa-811e1600-7951-436e-8b54-0ffe92effe89` |
| 4 | `POST /v1/conversations` | 201 | 26 | `qa-063f7adf-b8c5-4ce2-9985-3a5613463133` |
| 5 | `GET /v1/conversations` | 503 | 16 | `qa-bafc159f-84dc-4dec-8242-c68def35d8a7` |
| 6 | `POST /v1/auth/token` | 200 | 41 | `qa-0742a143-0ac6-4adf-8c36-9bf57bee6232` |
| 7 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-ccfce4d8-c2a5-4990-8c92-12d16512b58e` |
| 8 | `POST /v1/auth/token` | 401 | 14 | `qa-c645bbc3-6f6a-4ea4-b6b9-91b56f6dd4df` |
| 9 | `DELETE /v1/accounts/me` | 204 | 31 | `qa-1c08a544-df9e-40cd-b0c5-3e31edb3a119` |
| 10 | `POST /v1/auth/token` | 401 | 21 | `qa-4050c759-99cd-4641-9f9e-507c09d6e172` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-89b30259-71a6-461f-99a4-40d23dbcf511

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-89b30259-71a6-461f-99a4-40d23dbcf511
Content-Type: application/json

--- request body ---
{"handle":"qa-90078dea4c06","displayName":"QA 90078dea4c06","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-89b30259-71a6-461f-99a4-40d23dbcf511
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 476
RateLimit-Reset: 8
Location: /v1/accounts/qa-90078dea4c06
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ad180ee2-c901-49db-a07f-8f576050f288","handle":"qa-90078dea4c06","displayName":"QA 90078dea4c06","region":"eu","role":"user","createdAt":"2026-11-18T10:19:51.707513315Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-1e401244-b019-4a78-bee0-bcc3c9443acc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e401244-b019-4a78-bee0-bcc3c9443acc
Content-Type: application/json

--- request body ---
{"handle":"qa-eab7f75bff8f","displayName":"QA eab7f75bff8f","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-1e401244-b019-4a78-bee0-bcc3c9443acc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 467
RateLimit-Reset: 8
Location: /v1/accounts/qa-eab7f75bff8f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_adf40624-366a-47e7-b891-96660e4f9dc3","handle":"qa-eab7f75bff8f","displayName":"QA eab7f75bff8f","region":"eu","role":"user","createdAt":"2026-11-18T10:19:51.738826323Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-811e1600-7951-436e-8b54-0ffe92effe89

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-811e1600-7951-436e-8b54-0ffe92effe89
Content-Type: application/json

--- request body ---
{"handle":"qa-90078dea4c06","password":"****"}

--- response: 200 in 27 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-811e1600-7951-436e-8b54-0ffe92effe89
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 459
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ad180ee2-c901-49db-a07f-8f576050f288"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-063f7adf-b8c5-4ce2-9985-3a5613463133

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-063f7adf-b8c5-4ce2-9985-3a5613463133
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-eab7f75bff8f","subject":"Error contract","message":"Hi"}

--- response: 201 in 26 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-063f7adf-b8c5-4ce2-9985-3a5613463133
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
Location: /v1/conversations/cnv_1415b37e-f006-4638-b611-987f065e6022
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_1415b37e-f006-4638-b611-987f065e6022","subject":"Error contract","status":"open","region":"eu","participants":["qa-90078dea4c06","qa-eab7f75bff8f"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-18T10:19:51.808071856Z"}
```

## 5. GET /v1/conversations

```text
#5 GET http://localhost:7070/v1/conversations
correlation: qa-bafc159f-84dc-4dec-8242-c68def35d8a7

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 12870f71-c31e-4428-82a5-c5f997b768bc
X-Correlation-Id: qa-bafc159f-84dc-4dec-8242-c68def35d8a7
Content-Type: application/json

--- response: 503 in 16 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bafc159f-84dc-4dec-8242-c68def35d8a7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 261

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations","correlationId":"qa-bafc159f-84dc-4dec-8242-c68def35d8a7"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-0742a143-0ac6-4adf-8c36-9bf57bee6232

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0742a143-0ac6-4adf-8c36-9bf57bee6232
Content-Type: application/json

--- request body ---
{"handle":"qa-eab7f75bff8f","password":"****"}

--- response: 200 in 41 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-0742a143-0ac6-4adf-8c36-9bf57bee6232
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 444
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_adf40624-366a-47e7-b891-96660e4f9dc3"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ccfce4d8-c2a5-4990-8c92-12d16512b58e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ccfce4d8-c2a5-4990-8c92-12d16512b58e
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ccfce4d8-c2a5-4990-8c92-12d16512b58e
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
correlation: qa-c645bbc3-6f6a-4ea4-b6b9-91b56f6dd4df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c645bbc3-6f6a-4ea4-b6b9-91b56f6dd4df
Content-Type: application/json

--- request body ---
{"handle":"qa-eab7f75bff8f","password":"****"}

--- response: 401 in 14 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c645bbc3-6f6a-4ea4-b6b9-91b56f6dd4df
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 438
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c645bbc3-6f6a-4ea4-b6b9-91b56f6dd4df"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1c08a544-df9e-40cd-b0c5-3e31edb3a119

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1c08a544-df9e-40cd-b0c5-3e31edb3a119
Content-Type: application/json

--- response: 204 in 31 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1c08a544-df9e-40cd-b0c5-3e31edb3a119
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
correlation: qa-4050c759-99cd-4641-9f9e-507c09d6e172

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4050c759-99cd-4641-9f9e-507c09d6e172
Content-Type: application/json

--- request body ---
{"handle":"qa-90078dea4c06","password":"****"}

--- response: 401 in 21 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4050c759-99cd-4641-9f9e-507c09d6e172
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 427
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4050c759-99cd-4641-9f9e-507c09d6e172"}
```
