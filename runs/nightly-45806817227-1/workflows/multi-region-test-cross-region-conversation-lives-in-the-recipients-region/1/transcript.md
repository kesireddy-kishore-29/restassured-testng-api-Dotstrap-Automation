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
| 1 | `POST /v1/accounts` | 201 | 310 | `qa-07388b2d-74ee-43d3-8f43-468aaf364239` |
| 2 | `POST /v1/accounts` | 201 | 28 | `qa-627165de-2e64-4d05-b698-a69aef1f4f09` |
| 3 | `POST /v1/auth/token` | 200 | 11 | `qa-2af2e070-293e-4b9b-aba4-e41444862289` |
| 4 | `POST /v1/conversations` | 201 | 52 | `qa-629c51eb-e26d-4e35-ab0d-64db7eaad838` |
| 5 | `GET /v1/conversations/{id}` | 200 | 38 | `qa-fc1e3737-ea69-4aa9-8f11-0c2d0de02e41` |
| 6 | `POST /v1/auth/token` | 200 | 8 | `qa-079a23b4-5b91-44f0-99f7-11eafdee7aa5` |
| 7 | `GET /v1/conversations/{id}` | 200 | 7 | `qa-eba8e335-7703-4cbb-bd3b-a2dfcae5139f` |
| 8 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-79f7b86f-da47-40dd-8d1e-edfdb9549bb2` |
| 9 | `POST /v1/auth/token` | 401 | 9 | `qa-c464c633-bd19-45a4-8174-dd1633c563dd` |
| 10 | `DELETE /v1/accounts/me` | 204 | 31 | `qa-748f8658-0d99-4b6e-8a68-83e039885b1d` |
| 11 | `POST /v1/auth/token` | 401 | 20 | `qa-7a5926ac-a3b8-46ad-a7d4-aca58201604b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-07388b2d-74ee-43d3-8f43-468aaf364239

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-07388b2d-74ee-43d3-8f43-468aaf364239
Content-Type: application/json

--- request body ---
{"handle":"qa-3cf933166bf5","displayName":"QA 3cf933166bf5","password":"****","region":"in"}

--- response: 201 in 310 ms ---
Date: Thu, 26 Nov 2026 11:02:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-07388b2d-74ee-43d3-8f43-468aaf364239
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
Location: /v1/accounts/qa-3cf933166bf5
X-Served-Region: in
Content-Length: 181

{"id":"acc_aa97bd57-1099-4cc7-9666-c1334f51ffb7","handle":"qa-3cf933166bf5","displayName":"QA 3cf933166bf5","region":"in","role":"user","createdAt":"2026-11-26T11:02:31.637282737Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-627165de-2e64-4d05-b698-a69aef1f4f09

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-627165de-2e64-4d05-b698-a69aef1f4f09
Content-Type: application/json

--- request body ---
{"handle":"qa-4708d2774484","displayName":"QA 4708d2774484","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Thu, 26 Nov 2026 11:02:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-627165de-2e64-4d05-b698-a69aef1f4f09
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 10
Location: /v1/accounts/qa-4708d2774484
X-Served-Region: eu
Content-Length: 181

{"id":"acc_13ab2855-4971-4b87-9eae-6e5a88e0e160","handle":"qa-4708d2774484","displayName":"QA 4708d2774484","region":"eu","role":"user","createdAt":"2026-11-26T11:02:31.931558299Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-2af2e070-293e-4b9b-aba4-e41444862289

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2af2e070-293e-4b9b-aba4-e41444862289
Content-Type: application/json

--- request body ---
{"handle":"qa-3cf933166bf5","password":"****"}

--- response: 200 in 11 ms ---
Date: Thu, 26 Nov 2026 11:02:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-2af2e070-293e-4b9b-aba4-e41444862289
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 588
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_aa97bd57-1099-4cc7-9666-c1334f51ffb7"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-629c51eb-e26d-4e35-ab0d-64db7eaad838

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-629c51eb-e26d-4e35-ab0d-64db7eaad838
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-4708d2774484","subject":"Across regions","message":"Namaste"}

--- response: 201 in 52 ms ---
Date: Thu, 26 Nov 2026 11:02:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-629c51eb-e26d-4e35-ab0d-64db7eaad838
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
Location: /v1/conversations/cnv_a52e4c64-f3ce-4b63-a88d-61469ab49a44
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_a52e4c64-f3ce-4b63-a88d-61469ab49a44","subject":"Across regions","status":"open","region":"eu","participants":["qa-3cf933166bf5","qa-4708d2774484"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-26T11:02:32.013311675Z"}
```

## 5. GET /v1/conversations/{id}

```text
#5 GET http://localhost:7070/v1/conversations/cnv_a52e4c64-f3ce-4b63-a88d-61469ab49a44
correlation: qa-fc1e3737-ea69-4aa9-8f11-0c2d0de02e41

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc1e3737-ea69-4aa9-8f11-0c2d0de02e41
Content-Type: application/json

--- response: 200 in 38 ms ---
Date: Thu, 26 Nov 2026 11:02:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-fc1e3737-ea69-4aa9-8f11-0c2d0de02e41
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

{"id":"cnv_a52e4c64-f3ce-4b63-a88d-61469ab49a44","subject":"Across regions","status":"open","region":"eu","participants":["qa-3cf933166bf5","qa-4708d2774484"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-26T11:02:32.013311675Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-079a23b4-5b91-44f0-99f7-11eafdee7aa5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-079a23b4-5b91-44f0-99f7-11eafdee7aa5
Content-Type: application/json

--- request body ---
{"handle":"qa-4708d2774484","password":"****"}

--- response: 200 in 8 ms ---
Date: Thu, 26 Nov 2026 11:02:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-079a23b4-5b91-44f0-99f7-11eafdee7aa5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 582
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_13ab2855-4971-4b87-9eae-6e5a88e0e160"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_a52e4c64-f3ce-4b63-a88d-61469ab49a44
correlation: qa-eba8e335-7703-4cbb-bd3b-a2dfcae5139f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eba8e335-7703-4cbb-bd3b-a2dfcae5139f
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Thu, 26 Nov 2026 11:02:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-eba8e335-7703-4cbb-bd3b-a2dfcae5139f
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

{"id":"cnv_a52e4c64-f3ce-4b63-a88d-61469ab49a44","subject":"Across regions","status":"open","region":"eu","participants":["qa-3cf933166bf5","qa-4708d2774484"],"messageCount":1,"unreadCount":1,"createdAt":"2026-11-26T11:02:32.013311675Z"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-79f7b86f-da47-40dd-8d1e-edfdb9549bb2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-79f7b86f-da47-40dd-8d1e-edfdb9549bb2
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Thu, 26 Nov 2026 11:02:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-79f7b86f-da47-40dd-8d1e-edfdb9549bb2
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
correlation: qa-c464c633-bd19-45a4-8174-dd1633c563dd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c464c633-bd19-45a4-8174-dd1633c563dd
Content-Type: application/json

--- request body ---
{"handle":"qa-4708d2774484","password":"****"}

--- response: 401 in 9 ms ---
Date: Thu, 26 Nov 2026 11:02:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c464c633-bd19-45a4-8174-dd1633c563dd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 581
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c464c633-bd19-45a4-8174-dd1633c563dd"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-748f8658-0d99-4b6e-8a68-83e039885b1d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-748f8658-0d99-4b6e-8a68-83e039885b1d
Content-Type: application/json

--- response: 204 in 31 ms ---
Date: Thu, 26 Nov 2026 11:02:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-748f8658-0d99-4b6e-8a68-83e039885b1d
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
correlation: qa-7a5926ac-a3b8-46ad-a7d4-aca58201604b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7a5926ac-a3b8-46ad-a7d4-aca58201604b
Content-Type: application/json

--- request body ---
{"handle":"qa-3cf933166bf5","password":"****"}

--- response: 401 in 20 ms ---
Date: Thu, 26 Nov 2026 11:02:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7a5926ac-a3b8-46ad-a7d4-aca58201604b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7a5926ac-a3b8-46ad-a7d4-aca58201604b"}
```
