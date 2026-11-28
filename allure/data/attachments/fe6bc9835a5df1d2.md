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
| 1 | `POST /v1/accounts` | 201 | 502 | `qa-cf607609-b806-449e-a409-b7e0adc64c97` |
| 2 | `POST /v1/accounts` | 201 | 52 | `qa-2c1c3523-b394-4b96-ab7e-edcade7e3acc` |
| 3 | `POST /v1/auth/token` | 200 | 40 | `qa-55eff765-d99d-452c-bf02-5178a75597b3` |
| 4 | `POST /v1/conversations` | 201 | 69 | `qa-79577390-2ffb-4fd1-acbb-fede48886fe8` |
| 5 | `GET /v1/conversations/{id}` | 200 | 37 | `qa-6e82761e-405c-4ea2-b0ca-68baaff7ecdd` |
| 6 | `POST /v1/auth/token` | 200 | 20 | `qa-c185b2aa-c5cc-493a-9da8-5826055a5884` |
| 7 | `GET /v1/conversations/{id}` | 200 | 18 | `qa-aead93ad-625b-49bb-9806-233f25e10a92` |
| 8 | `DELETE /v1/accounts/me` | 204 | 31 | `qa-176a988b-ba74-4a4c-81d1-587df279e53e` |
| 9 | `POST /v1/auth/token` | 401 | 9 | `qa-ff7a1730-37f2-4318-a292-b0f5df116b80` |
| 10 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-16ef5cac-3fa8-4f1e-a8c1-972923c5bb35` |
| 11 | `POST /v1/auth/token` | 401 | 56 | `qa-61f27c4d-149e-4635-aba9-2e7333f1e917` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-cf607609-b806-449e-a409-b7e0adc64c97

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cf607609-b806-449e-a409-b7e0adc64c97
Content-Type: application/json

--- request body ---
{"handle":"qa-e6f3cdc5daca","displayName":"QA e6f3cdc5daca","password":"****","region":"in"}

--- response: 201 in 502 ms ---
Date: Sat, 28 Nov 2026 10:37:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-cf607609-b806-449e-a409-b7e0adc64c97
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 10
Location: /v1/accounts/qa-e6f3cdc5daca
X-Served-Region: in
Content-Length: 181

{"id":"acc_33011f84-e091-4749-bfdb-27321cf672bc","handle":"qa-e6f3cdc5daca","displayName":"QA e6f3cdc5daca","region":"in","role":"user","createdAt":"2026-11-28T10:37:19.390753426Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-2c1c3523-b394-4b96-ab7e-edcade7e3acc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2c1c3523-b394-4b96-ab7e-edcade7e3acc
Content-Type: application/json

--- request body ---
{"handle":"qa-0492cb38a106","displayName":"QA 0492cb38a106","password":"****","region":"eu"}

--- response: 201 in 52 ms ---
Date: Sat, 28 Nov 2026 10:37:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-2c1c3523-b394-4b96-ab7e-edcade7e3acc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 592
RateLimit-Reset: 10
Location: /v1/accounts/qa-0492cb38a106
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e7a2496d-d554-456e-ab0d-46370b9e6056","handle":"qa-0492cb38a106","displayName":"QA 0492cb38a106","region":"eu","role":"user","createdAt":"2026-11-28T10:37:19.929843973Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-55eff765-d99d-452c-bf02-5178a75597b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-55eff765-d99d-452c-bf02-5178a75597b3
Content-Type: application/json

--- request body ---
{"handle":"qa-e6f3cdc5daca","password":"****"}

--- response: 200 in 40 ms ---
Date: Sat, 28 Nov 2026 10:37:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-55eff765-d99d-452c-bf02-5178a75597b3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 587
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_33011f84-e091-4749-bfdb-27321cf672bc"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-79577390-2ffb-4fd1-acbb-fede48886fe8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-79577390-2ffb-4fd1-acbb-fede48886fe8
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-0492cb38a106","subject":"Across regions","message":"Namaste"}

--- response: 201 in 69 ms ---
Date: Sat, 28 Nov 2026 10:37:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-79577390-2ffb-4fd1-acbb-fede48886fe8
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
Location: /v1/conversations/cnv_26a39301-e065-4a55-94f1-6b105aea331a
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_26a39301-e065-4a55-94f1-6b105aea331a","subject":"Across regions","status":"open","region":"eu","participants":["qa-e6f3cdc5daca","qa-0492cb38a106"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-28T10:37:20.106450779Z"}
```

## 5. GET /v1/conversations/{id}

```text
#5 GET http://localhost:7070/v1/conversations/cnv_26a39301-e065-4a55-94f1-6b105aea331a
correlation: qa-6e82761e-405c-4ea2-b0ca-68baaff7ecdd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6e82761e-405c-4ea2-b0ca-68baaff7ecdd
Content-Type: application/json

--- response: 200 in 37 ms ---
Date: Sat, 28 Nov 2026 10:37:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-6e82761e-405c-4ea2-b0ca-68baaff7ecdd
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

{"id":"cnv_26a39301-e065-4a55-94f1-6b105aea331a","subject":"Across regions","status":"open","region":"eu","participants":["qa-e6f3cdc5daca","qa-0492cb38a106"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-28T10:37:20.106450779Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-c185b2aa-c5cc-493a-9da8-5826055a5884

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c185b2aa-c5cc-493a-9da8-5826055a5884
Content-Type: application/json

--- request body ---
{"handle":"qa-0492cb38a106","password":"****"}

--- response: 200 in 20 ms ---
Date: Sat, 28 Nov 2026 10:37:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-c185b2aa-c5cc-493a-9da8-5826055a5884
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 582
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e7a2496d-d554-456e-ab0d-46370b9e6056"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_26a39301-e065-4a55-94f1-6b105aea331a
correlation: qa-aead93ad-625b-49bb-9806-233f25e10a92

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aead93ad-625b-49bb-9806-233f25e10a92
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Sat, 28 Nov 2026 10:37:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-aead93ad-625b-49bb-9806-233f25e10a92
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

{"id":"cnv_26a39301-e065-4a55-94f1-6b105aea331a","subject":"Across regions","status":"open","region":"eu","participants":["qa-e6f3cdc5daca","qa-0492cb38a106"],"messageCount":1,"unreadCount":1,"createdAt":"2026-11-28T10:37:20.106450779Z"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-176a988b-ba74-4a4c-81d1-587df279e53e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-176a988b-ba74-4a4c-81d1-587df279e53e
Content-Type: application/json

--- response: 204 in 31 ms ---
Date: Sat, 28 Nov 2026 10:37:20 GMT
Content-Type: text/plain
X-Correlation-Id: qa-176a988b-ba74-4a4c-81d1-587df279e53e
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
correlation: qa-ff7a1730-37f2-4318-a292-b0f5df116b80

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff7a1730-37f2-4318-a292-b0f5df116b80
Content-Type: application/json

--- request body ---
{"handle":"qa-0492cb38a106","password":"****"}

--- response: 401 in 9 ms ---
Date: Sat, 28 Nov 2026 10:37:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ff7a1730-37f2-4318-a292-b0f5df116b80
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 581
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ff7a1730-37f2-4318-a292-b0f5df116b80"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-16ef5cac-3fa8-4f1e-a8c1-972923c5bb35

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-16ef5cac-3fa8-4f1e-a8c1-972923c5bb35
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Sat, 28 Nov 2026 10:37:20 GMT
Content-Type: text/plain
X-Correlation-Id: qa-16ef5cac-3fa8-4f1e-a8c1-972923c5bb35
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
correlation: qa-61f27c4d-149e-4635-aba9-2e7333f1e917

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-61f27c4d-149e-4635-aba9-2e7333f1e917
Content-Type: application/json

--- request body ---
{"handle":"qa-e6f3cdc5daca","password":"****"}

--- response: 401 in 56 ms ---
Date: Sat, 28 Nov 2026 10:37:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-61f27c4d-149e-4635-aba9-2e7333f1e917
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 568
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-61f27c4d-149e-4635-aba9-2e7333f1e917"}
```
