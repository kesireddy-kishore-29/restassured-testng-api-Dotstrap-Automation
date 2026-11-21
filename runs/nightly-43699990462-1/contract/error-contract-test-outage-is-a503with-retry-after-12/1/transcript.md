# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations/{id}/close]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[12]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 64 | `qa-d11c9d6e-7ce7-40f7-95d5-9968f8cf0e8b` |
| 2 | `POST /v1/accounts` | 201 | 28 | `qa-258806c8-56be-449c-8584-1661cd9897b0` |
| 3 | `POST /v1/auth/token` | 200 | 25 | `qa-ea0234c1-634b-4dda-b5bb-43af537ae2cf` |
| 4 | `POST /v1/conversations` | 201 | 18 | `qa-16ae2c8f-9fb8-4a0b-8396-db26fd083a7e` |
| 5 | `POST /v1/conversations/{id}/close` | 503 | 10 | `qa-cd68d679-d52e-4345-801d-486d549bfc36` |
| 6 | `POST /v1/auth/token` | 200 | 36 | `qa-bafd0e27-cafa-409d-8d56-8435d07058dc` |
| 7 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-3cb8552e-1be9-4ce9-b226-921d2eb1a533` |
| 8 | `POST /v1/auth/token` | 401 | 26 | `qa-04e8e782-3f6c-44fa-bc47-dbcbd52fd426` |
| 9 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-52449a5f-84fb-4f9b-bfd7-0ab6b7b58ef9` |
| 10 | `POST /v1/auth/token` | 401 | 26 | `qa-1214aec9-b839-40e6-b669-c9ec4b56b072` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d11c9d6e-7ce7-40f7-95d5-9968f8cf0e8b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d11c9d6e-7ce7-40f7-95d5-9968f8cf0e8b
Content-Type: application/json

--- request body ---
{"handle":"qa-1b738991cf38","displayName":"QA 1b738991cf38","password":"****","region":"eu"}

--- response: 201 in 64 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-d11c9d6e-7ce7-40f7-95d5-9968f8cf0e8b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 369
RateLimit-Reset: 7
Location: /v1/accounts/qa-1b738991cf38
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b874cc69-5803-47af-ab1c-839a35c341ef","handle":"qa-1b738991cf38","displayName":"QA 1b738991cf38","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.213313232Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-258806c8-56be-449c-8584-1661cd9897b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-258806c8-56be-449c-8584-1661cd9897b0
Content-Type: application/json

--- request body ---
{"handle":"qa-02cdb89dc3cc","displayName":"QA 02cdb89dc3cc","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-258806c8-56be-449c-8584-1661cd9897b0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 363
RateLimit-Reset: 7
Location: /v1/accounts/qa-02cdb89dc3cc
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a27ce5b3-7cac-4f2d-9c9a-f346790bc4dd","handle":"qa-02cdb89dc3cc","displayName":"QA 02cdb89dc3cc","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.242909835Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-ea0234c1-634b-4dda-b5bb-43af537ae2cf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ea0234c1-634b-4dda-b5bb-43af537ae2cf
Content-Type: application/json

--- request body ---
{"handle":"qa-1b738991cf38","password":"****"}

--- response: 200 in 25 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-ea0234c1-634b-4dda-b5bb-43af537ae2cf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 356
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b874cc69-5803-47af-ab1c-839a35c341ef"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-16ae2c8f-9fb8-4a0b-8396-db26fd083a7e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-16ae2c8f-9fb8-4a0b-8396-db26fd083a7e
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-02cdb89dc3cc","subject":"Error contract","message":"Hi"}

--- response: 201 in 18 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-16ae2c8f-9fb8-4a0b-8396-db26fd083a7e
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
Location: /v1/conversations/cnv_9dc0914c-5cb3-4f6b-80cb-0e13b4a9435c
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_9dc0914c-5cb3-4f6b-80cb-0e13b4a9435c","subject":"Error contract","status":"open","region":"eu","participants":["qa-1b738991cf38","qa-02cdb89dc3cc"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-15T09:36:10.305206841Z"}
```

## 5. POST /v1/conversations/{id}/close

```text
#5 POST http://localhost:7070/v1/conversations/cnv_9dc0914c-5cb3-4f6b-80cb-0e13b4a9435c/close
correlation: qa-cd68d679-d52e-4345-801d-486d549bfc36

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 98137e86-a780-41ae-a334-87d8e59513bf
X-Correlation-Id: qa-cd68d679-d52e-4345-801d-486d549bfc36
Content-Type: application/json

--- response: 503 in 10 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cd68d679-d52e-4345-801d-486d549bfc36
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 308

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_9dc0914c-5cb3-4f6b-80cb-0e13b4a9435c/close","correlationId":"qa-cd68d679-d52e-4345-801d-486d549bfc36"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-bafd0e27-cafa-409d-8d56-8435d07058dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bafd0e27-cafa-409d-8d56-8435d07058dc
Content-Type: application/json

--- request body ---
{"handle":"qa-02cdb89dc3cc","password":"****"}

--- response: 200 in 36 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-bafd0e27-cafa-409d-8d56-8435d07058dc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 339
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a27ce5b3-7cac-4f2d-9c9a-f346790bc4dd"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3cb8552e-1be9-4ce9-b226-921d2eb1a533

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3cb8552e-1be9-4ce9-b226-921d2eb1a533
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3cb8552e-1be9-4ce9-b226-921d2eb1a533
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
correlation: qa-04e8e782-3f6c-44fa-bc47-dbcbd52fd426

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04e8e782-3f6c-44fa-bc47-dbcbd52fd426
Content-Type: application/json

--- request body ---
{"handle":"qa-02cdb89dc3cc","password":"****"}

--- response: 401 in 26 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-04e8e782-3f6c-44fa-bc47-dbcbd52fd426
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 330
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-04e8e782-3f6c-44fa-bc47-dbcbd52fd426"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-52449a5f-84fb-4f9b-bfd7-0ab6b7b58ef9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-52449a5f-84fb-4f9b-bfd7-0ab6b7b58ef9
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-52449a5f-84fb-4f9b-bfd7-0ab6b7b58ef9
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
correlation: qa-1214aec9-b839-40e6-b669-c9ec4b56b072

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1214aec9-b839-40e6-b669-c9ec4b56b072
Content-Type: application/json

--- request body ---
{"handle":"qa-1b738991cf38","password":"****"}

--- response: 401 in 26 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1214aec9-b839-40e6-b669-c9ec4b56b072
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 321
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1214aec9-b839-40e6-b669-c9ec4b56b072"}
```
