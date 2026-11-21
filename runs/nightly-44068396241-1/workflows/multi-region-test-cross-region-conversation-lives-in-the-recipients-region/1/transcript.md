# Transcript: A cross-region conversation is stored in the recipient's region, for both sides

| | |
|---|---|
| Test | `com.qaautomation.tests.workflows.MultiRegionTest#crossRegionConversationLivesInTheRecipientsRegion` |
| Features | FEAT-REGION-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 11 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 345 | `qa-1f3acecd-ad47-494a-b019-62f44edc1928` |
| 2 | `POST /v1/accounts` | 201 | 44 | `qa-89199da0-772f-4421-8f71-d13d8a5ac64e` |
| 3 | `POST /v1/auth/token` | 200 | 30 | `qa-d5419d96-12d5-493c-a08f-a57b27168ae6` |
| 4 | `POST /v1/conversations` | 201 | 62 | `qa-dc551007-824b-43ba-b320-f60d30fdc38a` |
| 5 | `GET /v1/conversations/{id}` | 200 | 27 | `qa-6418f3c7-3282-45af-9100-fbbe41f35da0` |
| 6 | `POST /v1/auth/token` | 200 | 20 | `qa-3bc8f57a-1cc7-49a7-8b7f-0209577b78e6` |
| 7 | `GET /v1/conversations/{id}` | 200 | 6 | `qa-506da184-2d96-4a22-847d-6aeeb592206e` |
| 8 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-e70696f3-5ce6-434e-a5f7-962fc82765a5` |
| 9 | `POST /v1/auth/token` | 401 | 25 | `qa-9fcf3bfd-3805-414f-935f-20885a718ddd` |
| 10 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-40706d5f-a970-4cc5-8851-89175da083f0` |
| 11 | `POST /v1/auth/token` | 401 | 10 | `qa-36785900-7869-4a76-a7ae-eadb3324d5fa` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1f3acecd-ad47-494a-b019-62f44edc1928

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f3acecd-ad47-494a-b019-62f44edc1928
Content-Type: application/json

--- request body ---
{"handle":"qa-b5c6480bdb42","displayName":"QA b5c6480bdb42","password":"****","region":"in"}

--- response: 201 in 345 ms ---
Date: Tue, 17 Nov 2026 10:50:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-1f3acecd-ad47-494a-b019-62f44edc1928
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 10
Location: /v1/accounts/qa-b5c6480bdb42
X-Served-Region: in
Content-Length: 181

{"id":"acc_21dabb69-4636-48d4-b5bc-93aec38ae1a2","handle":"qa-b5c6480bdb42","displayName":"QA b5c6480bdb42","region":"in","role":"user","createdAt":"2026-11-17T10:50:08.160482116Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-89199da0-772f-4421-8f71-d13d8a5ac64e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-89199da0-772f-4421-8f71-d13d8a5ac64e
Content-Type: application/json

--- request body ---
{"handle":"qa-8bd4911e50ad","displayName":"QA 8bd4911e50ad","password":"****","region":"eu"}

--- response: 201 in 44 ms ---
Date: Tue, 17 Nov 2026 10:50:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-89199da0-772f-4421-8f71-d13d8a5ac64e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 594
RateLimit-Reset: 10
Location: /v1/accounts/qa-8bd4911e50ad
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3ea7a275-2eec-4b8f-b8e8-2616ebc5019f","handle":"qa-8bd4911e50ad","displayName":"QA 8bd4911e50ad","region":"eu","role":"user","createdAt":"2026-11-17T10:50:08.448799581Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-d5419d96-12d5-493c-a08f-a57b27168ae6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d5419d96-12d5-493c-a08f-a57b27168ae6
Content-Type: application/json

--- request body ---
{"handle":"qa-b5c6480bdb42","password":"****"}

--- response: 200 in 30 ms ---
Date: Tue, 17 Nov 2026 10:50:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-d5419d96-12d5-493c-a08f-a57b27168ae6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_21dabb69-4636-48d4-b5bc-93aec38ae1a2"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-dc551007-824b-43ba-b320-f60d30fdc38a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc551007-824b-43ba-b320-f60d30fdc38a
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-8bd4911e50ad","subject":"Across regions","message":"Namaste"}

--- response: 201 in 62 ms ---
Date: Tue, 17 Nov 2026 10:50:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-dc551007-824b-43ba-b320-f60d30fdc38a
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
X-Served-Region: in
Location: /v1/conversations/cnv_08a4319f-7748-4194-beed-6ab4fceeed15
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_08a4319f-7748-4194-beed-6ab4fceeed15","subject":"Across regions","status":"open","region":"eu","participants":["qa-b5c6480bdb42","qa-8bd4911e50ad"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-17T10:50:08.588381975Z"}
```

## 5. GET /v1/conversations/{id}

```text
#5 GET http://localhost:7070/v1/conversations/cnv_08a4319f-7748-4194-beed-6ab4fceeed15
correlation: qa-6418f3c7-3282-45af-9100-fbbe41f35da0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6418f3c7-3282-45af-9100-fbbe41f35da0
Content-Type: application/json

--- response: 200 in 27 ms ---
Date: Tue, 17 Nov 2026 10:50:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-6418f3c7-3282-45af-9100-fbbe41f35da0
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
X-Served-Region: in
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_08a4319f-7748-4194-beed-6ab4fceeed15","subject":"Across regions","status":"open","region":"eu","participants":["qa-b5c6480bdb42","qa-8bd4911e50ad"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-17T10:50:08.588381975Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-3bc8f57a-1cc7-49a7-8b7f-0209577b78e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3bc8f57a-1cc7-49a7-8b7f-0209577b78e6
Content-Type: application/json

--- request body ---
{"handle":"qa-8bd4911e50ad","password":"****"}

--- response: 200 in 20 ms ---
Date: Tue, 17 Nov 2026 10:50:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-3bc8f57a-1cc7-49a7-8b7f-0209577b78e6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3ea7a275-2eec-4b8f-b8e8-2616ebc5019f"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_08a4319f-7748-4194-beed-6ab4fceeed15
correlation: qa-506da184-2d96-4a22-847d-6aeeb592206e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-506da184-2d96-4a22-847d-6aeeb592206e
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Tue, 17 Nov 2026 10:50:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-506da184-2d96-4a22-847d-6aeeb592206e
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
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_08a4319f-7748-4194-beed-6ab4fceeed15","subject":"Across regions","status":"open","region":"eu","participants":["qa-b5c6480bdb42","qa-8bd4911e50ad"],"messageCount":1,"unreadCount":1,"createdAt":"2026-11-17T10:50:08.588381975Z"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e70696f3-5ce6-434e-a5f7-962fc82765a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e70696f3-5ce6-434e-a5f7-962fc82765a5
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Tue, 17 Nov 2026 10:50:08 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e70696f3-5ce6-434e-a5f7-962fc82765a5
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

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-9fcf3bfd-3805-414f-935f-20885a718ddd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9fcf3bfd-3805-414f-935f-20885a718ddd
Content-Type: application/json

--- request body ---
{"handle":"qa-8bd4911e50ad","password":"****"}

--- response: 401 in 25 ms ---
Date: Tue, 17 Nov 2026 10:50:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9fcf3bfd-3805-414f-935f-20885a718ddd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9fcf3bfd-3805-414f-935f-20885a718ddd"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-40706d5f-a970-4cc5-8851-89175da083f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-40706d5f-a970-4cc5-8851-89175da083f0
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Tue, 17 Nov 2026 10:50:08 GMT
Content-Type: text/plain
X-Correlation-Id: qa-40706d5f-a970-4cc5-8851-89175da083f0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: in
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-36785900-7869-4a76-a7ae-eadb3324d5fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-36785900-7869-4a76-a7ae-eadb3324d5fa
Content-Type: application/json

--- request body ---
{"handle":"qa-b5c6480bdb42","password":"****"}

--- response: 401 in 10 ms ---
Date: Tue, 17 Nov 2026 10:50:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-36785900-7869-4a76-a7ae-eadb3324d5fa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-36785900-7869-4a76-a7ae-eadb3324d5fa"}
```
