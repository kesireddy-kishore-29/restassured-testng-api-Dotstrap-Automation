# Transcript: Every operation answers an outage with a 503 problem and Retry-After [PATCH /v1/accounts/me]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[3]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 63 | `qa-cb82c170-cfa7-4bd2-b734-236379710c54` |
| 2 | `POST /v1/accounts` | 201 | 27 | `qa-fec48203-71d5-4a86-95f1-d53c83373c1a` |
| 3 | `POST /v1/auth/token` | 200 | 29 | `qa-a5e92abb-d81f-4653-8735-e969ca5e9e01` |
| 4 | `POST /v1/conversations` | 201 | 21 | `qa-ebeb9f88-82f7-412e-8d7f-3645a43c3426` |
| 5 | `PATCH /v1/accounts/me` | 503 | 23 | `qa-8288bbf3-01c0-4786-a6f8-f7fadb225fc6` |
| 6 | `POST /v1/auth/token` | 200 | 37 | `qa-1a60cf5b-8756-4a2f-ac46-05324b6cd60e` |
| 7 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-378bdd94-f6eb-4e2d-97c6-e7df841a7fd9` |
| 8 | `POST /v1/auth/token` | 401 | 19 | `qa-3af1df7d-5ad0-4aad-ba96-1a6c0dc50048` |
| 9 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-c1e98829-3ef3-4d63-a7c6-215c7416b37c` |
| 10 | `POST /v1/auth/token` | 401 | 14 | `qa-25fd5b20-f704-40dc-811d-93452326abb2` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-cb82c170-cfa7-4bd2-b734-236379710c54

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb82c170-cfa7-4bd2-b734-236379710c54
Content-Type: application/json

--- request body ---
{"handle":"qa-06e91f0b2443","displayName":"QA 06e91f0b2443","password":"****","region":"eu"}

--- response: 201 in 63 ms ---
Date: Tue, 10 Nov 2026 09:59:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-cb82c170-cfa7-4bd2-b734-236379710c54
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 561
RateLimit-Reset: 10
Location: /v1/accounts/qa-06e91f0b2443
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f6d3442a-319f-40c6-8b8d-e67a53a275ae","handle":"qa-06e91f0b2443","displayName":"QA 06e91f0b2443","region":"eu","role":"user","createdAt":"2026-11-10T09:59:35.152428321Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-fec48203-71d5-4a86-95f1-d53c83373c1a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fec48203-71d5-4a86-95f1-d53c83373c1a
Content-Type: application/json

--- request body ---
{"handle":"qa-b45510a268e7","displayName":"QA b45510a268e7","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Tue, 10 Nov 2026 09:59:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-fec48203-71d5-4a86-95f1-d53c83373c1a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 552
RateLimit-Reset: 9
Location: /v1/accounts/qa-b45510a268e7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fb9d322e-bf3c-4f70-951e-4514f2a4f19f","handle":"qa-b45510a268e7","displayName":"QA b45510a268e7","region":"eu","role":"user","createdAt":"2026-11-10T09:59:35.200672341Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-a5e92abb-d81f-4653-8735-e969ca5e9e01

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a5e92abb-d81f-4653-8735-e969ca5e9e01
Content-Type: application/json

--- request body ---
{"handle":"qa-06e91f0b2443","password":"****"}

--- response: 200 in 29 ms ---
Date: Tue, 10 Nov 2026 09:59:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-a5e92abb-d81f-4653-8735-e969ca5e9e01
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 549
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f6d3442a-319f-40c6-8b8d-e67a53a275ae"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-ebeb9f88-82f7-412e-8d7f-3645a43c3426

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ebeb9f88-82f7-412e-8d7f-3645a43c3426
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-b45510a268e7","subject":"Error contract","message":"Hi"}

--- response: 201 in 21 ms ---
Date: Tue, 10 Nov 2026 09:59:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-ebeb9f88-82f7-412e-8d7f-3645a43c3426
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
Location: /v1/conversations/cnv_7f6e78a1-8901-4c0e-9c8a-00bb05c422ec
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_7f6e78a1-8901-4c0e-9c8a-00bb05c422ec","subject":"Error contract","status":"open","region":"eu","participants":["qa-06e91f0b2443","qa-b45510a268e7"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-10T09:59:35.274365192Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-8288bbf3-01c0-4786-a6f8-f7fadb225fc6

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 26b76b40-5282-4ad0-84b4-81009b3c0123
X-Correlation-Id: qa-8288bbf3-01c0-4786-a6f8-f7fadb225fc6
Content-Type: application/json

--- request body ---
{"displayName":"Probe"}

--- response: 503 in 23 ms ---
Date: Tue, 10 Nov 2026 09:59:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8288bbf3-01c0-4786-a6f8-f7fadb225fc6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-8288bbf3-01c0-4786-a6f8-f7fadb225fc6"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-1a60cf5b-8756-4a2f-ac46-05324b6cd60e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1a60cf5b-8756-4a2f-ac46-05324b6cd60e
Content-Type: application/json

--- request body ---
{"handle":"qa-b45510a268e7","password":"****"}

--- response: 200 in 37 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-1a60cf5b-8756-4a2f-ac46-05324b6cd60e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 525
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fb9d322e-bf3c-4f70-951e-4514f2a4f19f"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-378bdd94-f6eb-4e2d-97c6-e7df841a7fd9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-378bdd94-f6eb-4e2d-97c6-e7df841a7fd9
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-378bdd94-f6eb-4e2d-97c6-e7df841a7fd9
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
correlation: qa-3af1df7d-5ad0-4aad-ba96-1a6c0dc50048

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3af1df7d-5ad0-4aad-ba96-1a6c0dc50048
Content-Type: application/json

--- request body ---
{"handle":"qa-b45510a268e7","password":"****"}

--- response: 401 in 19 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3af1df7d-5ad0-4aad-ba96-1a6c0dc50048
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 505
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3af1df7d-5ad0-4aad-ba96-1a6c0dc50048"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c1e98829-3ef3-4d63-a7c6-215c7416b37c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c1e98829-3ef3-4d63-a7c6-215c7416b37c
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c1e98829-3ef3-4d63-a7c6-215c7416b37c
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
correlation: qa-25fd5b20-f704-40dc-811d-93452326abb2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-25fd5b20-f704-40dc-811d-93452326abb2
Content-Type: application/json

--- request body ---
{"handle":"qa-06e91f0b2443","password":"****"}

--- response: 401 in 14 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-25fd5b20-f704-40dc-811d-93452326abb2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 489
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-25fd5b20-f704-40dc-811d-93452326abb2"}
```
