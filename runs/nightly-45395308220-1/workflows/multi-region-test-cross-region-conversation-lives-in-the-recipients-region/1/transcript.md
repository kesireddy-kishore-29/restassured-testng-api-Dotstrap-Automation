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
| 1 | `POST /v1/accounts` | 201 | 537 | `qa-9675cad4-f32e-4fb4-922e-a8b5bc25cd6d` |
| 2 | `POST /v1/accounts` | 201 | 71 | `qa-1a70ee41-c4cb-492a-bbdf-a4829492aba9` |
| 3 | `POST /v1/auth/token` | 200 | 24 | `qa-81763cf7-b738-48ff-af73-9ea557008822` |
| 4 | `POST /v1/conversations` | 201 | 96 | `qa-853fc806-638b-4f7e-8295-abe196d8fc93` |
| 5 | `GET /v1/conversations/{id}` | 200 | 49 | `qa-df4e08fc-1619-4b00-ab33-86fb75da70b5` |
| 6 | `POST /v1/auth/token` | 200 | 23 | `qa-ff220f0a-eaa7-45c6-8ac1-666a7603fe1e` |
| 7 | `GET /v1/conversations/{id}` | 200 | 19 | `qa-bdda8873-69d0-4305-b209-ab48be1e8768` |
| 8 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-eb25d6b0-e6a0-4b0f-97d0-00b3251f8a83` |
| 9 | `POST /v1/auth/token` | 401 | 17 | `qa-6368adfa-9429-46a7-a55b-1c5ae5b95c2f` |
| 10 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-2ae6c566-ae4c-4798-9217-b05f18f4b93f` |
| 11 | `POST /v1/auth/token` | 401 | 18 | `qa-3f96d86d-6d44-4aaa-aeb7-4b31289d0ff9` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9675cad4-f32e-4fb4-922e-a8b5bc25cd6d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9675cad4-f32e-4fb4-922e-a8b5bc25cd6d
Content-Type: application/json

--- request body ---
{"handle":"qa-8bc66fcf0f16","displayName":"QA 8bc66fcf0f16","password":"****","region":"in"}

--- response: 201 in 537 ms ---
Date: Tue, 24 Nov 2026 12:38:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-9675cad4-f32e-4fb4-922e-a8b5bc25cd6d
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
Location: /v1/accounts/qa-8bc66fcf0f16
X-Served-Region: in
Content-Length: 181

{"id":"acc_3cc79633-142e-4d6b-9767-fd8a8850e95e","handle":"qa-8bc66fcf0f16","displayName":"QA 8bc66fcf0f16","region":"in","role":"user","createdAt":"2026-11-24T12:38:09.041292506Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-1a70ee41-c4cb-492a-bbdf-a4829492aba9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1a70ee41-c4cb-492a-bbdf-a4829492aba9
Content-Type: application/json

--- request body ---
{"handle":"qa-ed49e2a5c452","displayName":"QA ed49e2a5c452","password":"****","region":"eu"}

--- response: 201 in 71 ms ---
Date: Tue, 24 Nov 2026 12:38:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-1a70ee41-c4cb-492a-bbdf-a4829492aba9
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
Location: /v1/accounts/qa-ed49e2a5c452
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a7de48c7-61b9-45c7-954a-6e0d36fea13d","handle":"qa-ed49e2a5c452","displayName":"QA ed49e2a5c452","region":"eu","role":"user","createdAt":"2026-11-24T12:38:09.577523779Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-81763cf7-b738-48ff-af73-9ea557008822

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-81763cf7-b738-48ff-af73-9ea557008822
Content-Type: application/json

--- request body ---
{"handle":"qa-8bc66fcf0f16","password":"****"}

--- response: 200 in 24 ms ---
Date: Tue, 24 Nov 2026 12:38:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-81763cf7-b738-48ff-af73-9ea557008822
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3cc79633-142e-4d6b-9767-fd8a8850e95e"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-853fc806-638b-4f7e-8295-abe196d8fc93

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-853fc806-638b-4f7e-8295-abe196d8fc93
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-ed49e2a5c452","subject":"Across regions","message":"Namaste"}

--- response: 201 in 96 ms ---
Date: Tue, 24 Nov 2026 12:38:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-853fc806-638b-4f7e-8295-abe196d8fc93
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
Location: /v1/conversations/cnv_cc987a62-fee3-4e88-b90c-ac5b6390ef9c
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_cc987a62-fee3-4e88-b90c-ac5b6390ef9c","subject":"Across regions","status":"open","region":"eu","participants":["qa-8bc66fcf0f16","qa-ed49e2a5c452"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-24T12:38:09.758429524Z"}
```

## 5. GET /v1/conversations/{id}

```text
#5 GET http://localhost:7070/v1/conversations/cnv_cc987a62-fee3-4e88-b90c-ac5b6390ef9c
correlation: qa-df4e08fc-1619-4b00-ab33-86fb75da70b5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df4e08fc-1619-4b00-ab33-86fb75da70b5
Content-Type: application/json

--- response: 200 in 49 ms ---
Date: Tue, 24 Nov 2026 12:38:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-df4e08fc-1619-4b00-ab33-86fb75da70b5
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

{"id":"cnv_cc987a62-fee3-4e88-b90c-ac5b6390ef9c","subject":"Across regions","status":"open","region":"eu","participants":["qa-8bc66fcf0f16","qa-ed49e2a5c452"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-24T12:38:09.758429524Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-ff220f0a-eaa7-45c6-8ac1-666a7603fe1e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff220f0a-eaa7-45c6-8ac1-666a7603fe1e
Content-Type: application/json

--- request body ---
{"handle":"qa-ed49e2a5c452","password":"****"}

--- response: 200 in 23 ms ---
Date: Tue, 24 Nov 2026 12:38:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-ff220f0a-eaa7-45c6-8ac1-666a7603fe1e
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a7de48c7-61b9-45c7-954a-6e0d36fea13d"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_cc987a62-fee3-4e88-b90c-ac5b6390ef9c
correlation: qa-bdda8873-69d0-4305-b209-ab48be1e8768

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bdda8873-69d0-4305-b209-ab48be1e8768
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Tue, 24 Nov 2026 12:38:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-bdda8873-69d0-4305-b209-ab48be1e8768
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

{"id":"cnv_cc987a62-fee3-4e88-b90c-ac5b6390ef9c","subject":"Across regions","status":"open","region":"eu","participants":["qa-8bc66fcf0f16","qa-ed49e2a5c452"],"messageCount":1,"unreadCount":1,"createdAt":"2026-11-24T12:38:09.758429524Z"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-eb25d6b0-e6a0-4b0f-97d0-00b3251f8a83

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eb25d6b0-e6a0-4b0f-97d0-00b3251f8a83
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Tue, 24 Nov 2026 12:38:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-eb25d6b0-e6a0-4b0f-97d0-00b3251f8a83
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
correlation: qa-6368adfa-9429-46a7-a55b-1c5ae5b95c2f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6368adfa-9429-46a7-a55b-1c5ae5b95c2f
Content-Type: application/json

--- request body ---
{"handle":"qa-ed49e2a5c452","password":"****"}

--- response: 401 in 17 ms ---
Date: Tue, 24 Nov 2026 12:38:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6368adfa-9429-46a7-a55b-1c5ae5b95c2f
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6368adfa-9429-46a7-a55b-1c5ae5b95c2f"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2ae6c566-ae4c-4798-9217-b05f18f4b93f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2ae6c566-ae4c-4798-9217-b05f18f4b93f
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Tue, 24 Nov 2026 12:38:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2ae6c566-ae4c-4798-9217-b05f18f4b93f
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
correlation: qa-3f96d86d-6d44-4aaa-aeb7-4b31289d0ff9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f96d86d-6d44-4aaa-aeb7-4b31289d0ff9
Content-Type: application/json

--- request body ---
{"handle":"qa-8bc66fcf0f16","password":"****"}

--- response: 401 in 18 ms ---
Date: Tue, 24 Nov 2026 12:38:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3f96d86d-6d44-4aaa-aeb7-4b31289d0ff9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3f96d86d-6d44-4aaa-aeb7-4b31289d0ff9"}
```
