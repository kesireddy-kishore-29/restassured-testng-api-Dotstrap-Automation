# Transcript: Two people exchange messages; an outsider is kept out; closing stops the thread

| | |
|---|---|
| Test | `com.qaautomation.tests.workflows.MultiActorConversationTest#twoPeopleConverseAndTheOwnerEndsIt` |
| Features | FEAT-CONV-01, FEAT-CONV-02, FEAT-CONV-03, FEAT-AUTHZ-01, FEAT-REGION-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 33 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 445 | `qa-c56ee42d-23e4-4e50-a950-28f46305a1ca` |
| 2 | `POST /v1/accounts` | 201 | 29 | `qa-d4395c21-730a-4d39-aa9b-5f7fffd7ab15` |
| 3 | `POST /v1/accounts` | 201 | 23 | `qa-185106a9-b004-4c60-ba00-9a8af114e6bc` |
| 4 | `POST /v1/auth/token` | 200 | 27 | `qa-09c9552f-f523-4bc8-982c-39ea52d69749` |
| 5 | `POST /v1/conversations` | 201 | 16 | `qa-1a3eeb6a-81f2-46bf-a5e9-09cb175d4e0c` |
| 6 | `POST /v1/auth/token` | 200 | 25 | `qa-053df326-edb0-4b67-9a28-61630cacecb0` |
| 7 | `GET /v1/conversations` | 200 | 20 | `qa-7fb70d8d-cd63-447a-9233-3217cfc58786` |
| 8 | `GET /v1/conversations/{id}/messages` | 200 | 26 | `qa-a42c38d6-747f-4868-be6d-87ce44b1085c` |
| 9 | `POST /v1/conversations/{id}/read` | 200 | 25 | `qa-92ff714c-1912-4af5-8d78-cb3008eecaa8` |
| 10 | `GET /v1/conversations/{id}` | 200 | 15 | `qa-07f1db40-11c1-4f08-86e9-23107c8cd350` |
| 11 | `POST /v1/conversations/{id}/messages` | 201 | 14 | `qa-8571f693-2f78-4daa-8968-8f6058245d8d` |
| 12 | `POST /v1/conversations/{id}/messages` | 201 | 21 | `qa-97e5e2c5-c949-4c70-95ad-344602881ee5` |
| 13 | `GET /v1/conversations/{id}` | 200 | 20 | `qa-281595ba-9c64-412f-b513-f8c7d644b83c` |
| 14 | `GET /v1/conversations/{id}/messages` | 200 | 13 | `qa-3be16f8e-cdd5-46b8-a2b4-f8b4aa15513c` |
| 15 | `GET /v1/credits/balance` | 200 | 15 | `qa-722601f6-99b6-4931-bdeb-c462d73a5e46` |
| 16 | `GET /v1/credits/balance` | 200 | 13 | `qa-b9452119-c686-4a91-a47a-9d55177d9332` |
| 17 | `POST /v1/auth/token` | 200 | 11 | `qa-47d8e0b1-f3b5-4347-8d63-23f24e17829f` |
| 18 | `GET /v1/conversations/{id}` | 403 | 5 | `qa-5aa66b6e-1218-4149-bfe4-2243a6fac33d` |
| 19 | `GET /v1/conversations/{id}/messages` | 403 | 11 | `qa-e13dfca8-52f8-4f0e-9daa-5ec49c246999` |
| 20 | `POST /v1/conversations/{id}/messages` | 403 | 10 | `qa-9d335bcc-a5ef-4056-b68a-043f5868f383` |
| 21 | `GET /v1/conversations` | 200 | 7 | `qa-931e48e3-573c-403e-9094-c8470e70acb7` |
| 22 | `GET /v1/credits/balance` | 200 | 5 | `qa-81b1697f-57f8-44e9-abc1-091f24a5c9d7` |
| 23 | `POST /v1/conversations/{id}/close` | 200 | 8 | `qa-cc74c7fa-765b-4e44-a113-e6859432e37a` |
| 24 | `POST /v1/conversations/{id}/close` | 200 | 6 | `qa-8d37306a-1409-4e15-9217-9b9ff19a6d6d` |
| 25 | `GET /v1/conversations/{id}/messages` | 200 | 6 | `qa-96d730e7-c082-4a87-a36a-71783a1d4198` |
| 26 | `POST /v1/conversations/{id}/messages` | 409 | 5 | `qa-693e2a89-1704-4f28-b7a0-edbadb0884e9` |
| 27 | `GET /v1/credits/balance` | 200 | 5 | `qa-343a4234-e1f5-4263-a385-70cf4a0f7d12` |
| 28 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-0f6ea3cb-fd73-49c1-b302-192cf24108f1` |
| 29 | `POST /v1/auth/token` | 401 | 6 | `qa-7da1b01d-5938-4eb7-b69e-3974e2cdd245` |
| 30 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-2fcdfa8a-30a2-4720-959b-c3e3736fc030` |
| 31 | `POST /v1/auth/token` | 401 | 4 | `qa-f67a3879-1735-4a77-ac74-5dffe3a9f5c6` |
| 32 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-b45629d5-b2b1-4866-8451-e9d7205c6dc6` |
| 33 | `POST /v1/auth/token` | 401 | 4 | `qa-62be042d-d3bc-4a53-9aa5-6acb0323f029` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c56ee42d-23e4-4e50-a950-28f46305a1ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c56ee42d-23e4-4e50-a950-28f46305a1ca
Content-Type: application/json

--- request body ---
{"handle":"qa-1be3834937d0","displayName":"QA 1be3834937d0","password":"****","region":"eu"}

--- response: 201 in 445 ms ---
Date: Fri, 27 Nov 2026 10:59:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-c56ee42d-23e4-4e50-a950-28f46305a1ca
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
Location: /v1/accounts/qa-1be3834937d0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0fa446cf-0346-4409-8302-aecdbe0322c3","handle":"qa-1be3834937d0","displayName":"QA 1be3834937d0","region":"eu","role":"user","createdAt":"2026-11-27T10:59:52.017519158Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-d4395c21-730a-4d39-aa9b-5f7fffd7ab15

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d4395c21-730a-4d39-aa9b-5f7fffd7ab15
Content-Type: application/json

--- request body ---
{"handle":"qa-fc4ae80018f6","displayName":"QA fc4ae80018f6","password":"****","region":"us"}

--- response: 201 in 29 ms ---
Date: Fri, 27 Nov 2026 10:59:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-d4395c21-730a-4d39-aa9b-5f7fffd7ab15
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
Location: /v1/accounts/qa-fc4ae80018f6
X-Served-Region: us
Content-Length: 181

{"id":"acc_1927bac1-70af-4c1d-9da6-5db56333c20b","handle":"qa-fc4ae80018f6","displayName":"QA fc4ae80018f6","region":"us","role":"user","createdAt":"2026-11-27T10:59:52.393519272Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-185106a9-b004-4c60-ba00-9a8af114e6bc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-185106a9-b004-4c60-ba00-9a8af114e6bc
Content-Type: application/json

--- request body ---
{"handle":"qa-165ff5e9328d","displayName":"QA 165ff5e9328d","password":"****","region":"in"}

--- response: 201 in 23 ms ---
Date: Fri, 27 Nov 2026 10:59:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-185106a9-b004-4c60-ba00-9a8af114e6bc
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
Location: /v1/accounts/qa-165ff5e9328d
X-Served-Region: in
Content-Length: 181

{"id":"acc_a989d590-fe08-4c5f-99cb-b8aa8bee4604","handle":"qa-165ff5e9328d","displayName":"QA 165ff5e9328d","region":"in","role":"user","createdAt":"2026-11-27T10:59:52.446775753Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-09c9552f-f523-4bc8-982c-39ea52d69749

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-09c9552f-f523-4bc8-982c-39ea52d69749
Content-Type: application/json

--- request body ---
{"handle":"qa-1be3834937d0","password":"****"}

--- response: 200 in 27 ms ---
Date: Fri, 27 Nov 2026 10:59:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-09c9552f-f523-4bc8-982c-39ea52d69749
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 586
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0fa446cf-0346-4409-8302-aecdbe0322c3"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-1a3eeb6a-81f2-46bf-a5e9-09cb175d4e0c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1a3eeb6a-81f2-46bf-a5e9-09cb175d4e0c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-fc4ae80018f6","subject":"Project kickoff","message":"Hi Ben, got a minute?"}

--- response: 201 in 16 ms ---
Date: Fri, 27 Nov 2026 10:59:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-1a3eeb6a-81f2-46bf-a5e9-09cb175d4e0c
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
Location: /v1/conversations/cnv_f3da1691-598b-4d70-8c8d-6a6f06616421
X-Data-Region: us
Content-Length: 238

{"id":"cnv_f3da1691-598b-4d70-8c8d-6a6f06616421","subject":"Project kickoff","status":"open","region":"us","participants":["qa-1be3834937d0","qa-fc4ae80018f6"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-27T10:59:52.533193934Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-053df326-edb0-4b67-9a28-61630cacecb0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-053df326-edb0-4b67-9a28-61630cacecb0
Content-Type: application/json

--- request body ---
{"handle":"qa-fc4ae80018f6","password":"****"}

--- response: 200 in 25 ms ---
Date: Fri, 27 Nov 2026 10:59:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-053df326-edb0-4b67-9a28-61630cacecb0
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1927bac1-70af-4c1d-9da6-5db56333c20b"}
```

## 7. GET /v1/conversations

```text
#7 GET http://localhost:7070/v1/conversations
correlation: qa-7fb70d8d-cd63-447a-9233-3217cfc58786

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7fb70d8d-cd63-447a-9233-3217cfc58786
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Fri, 27 Nov 2026 10:59:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-7fb70d8d-cd63-447a-9233-3217cfc58786
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
X-Served-Region: us
Content-Length: 260

{"items":[{"id":"cnv_f3da1691-598b-4d70-8c8d-6a6f06616421","subject":"Project kickoff","status":"open","region":"us","participants":["qa-1be3834937d0","qa-fc4ae80018f6"],"messageCount":1,"unreadCount":1,"createdAt":"2026-11-27T10:59:52.533193934Z"}],"total":1}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_f3da1691-598b-4d70-8c8d-6a6f06616421/messages
correlation: qa-a42c38d6-747f-4868-be6d-87ce44b1085c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a42c38d6-747f-4868-be6d-87ce44b1085c
Content-Type: application/json

--- response: 200 in 26 ms ---
Date: Fri, 27 Nov 2026 10:59:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-a42c38d6-747f-4868-be6d-87ce44b1085c
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
X-Served-Region: us
Content-Length: 234

{"items":[{"id":"msg_bcf920f4-8099-4a73-aec6-201c4d0b78c8","conversationId":"cnv_f3da1691-598b-4d70-8c8d-6a6f06616421","sender":"qa-1be3834937d0","body":"Hi Ben, got a minute?","createdAt":"2026-11-27T10:59:52.533203127Z"}],"total":1}
```

## 9. POST /v1/conversations/{id}/read

```text
#9 POST http://localhost:7070/v1/conversations/cnv_f3da1691-598b-4d70-8c8d-6a6f06616421/read
correlation: qa-92ff714c-1912-4af5-8d78-cb3008eecaa8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-92ff714c-1912-4af5-8d78-cb3008eecaa8
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Fri, 27 Nov 2026 10:59:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-92ff714c-1912-4af5-8d78-cb3008eecaa8
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
X-Served-Region: us
Content-Length: 77

{"conversationId":"cnv_f3da1691-598b-4d70-8c8d-6a6f06616421","unreadCount":0}
```

## 10. GET /v1/conversations/{id}

```text
#10 GET http://localhost:7070/v1/conversations/cnv_f3da1691-598b-4d70-8c8d-6a6f06616421
correlation: qa-07f1db40-11c1-4f08-86e9-23107c8cd350

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-07f1db40-11c1-4f08-86e9-23107c8cd350
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Fri, 27 Nov 2026 10:59:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-07f1db40-11c1-4f08-86e9-23107c8cd350
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: us
X-Data-Region: us
Content-Length: 238

{"id":"cnv_f3da1691-598b-4d70-8c8d-6a6f06616421","subject":"Project kickoff","status":"open","region":"us","participants":["qa-1be3834937d0","qa-fc4ae80018f6"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-27T10:59:52.533193934Z"}
```

## 11. POST /v1/conversations/{id}/messages

```text
#11 POST http://localhost:7070/v1/conversations/cnv_f3da1691-598b-4d70-8c8d-6a6f06616421/messages
correlation: qa-8571f693-2f78-4daa-8968-8f6058245d8d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8571f693-2f78-4daa-8968-8f6058245d8d
Content-Type: application/json

--- request body ---
{"body":"Sure, now works"}

--- response: 201 in 14 ms ---
Date: Fri, 27 Nov 2026 10:59:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-8571f693-2f78-4daa-8968-8f6058245d8d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 55
RateLimit-Reset: 10
X-Served-Region: us
Content-Length: 206

{"id":"msg_e49bfd24-9af2-4b4f-8fb1-331fc963af27","conversationId":"cnv_f3da1691-598b-4d70-8c8d-6a6f06616421","sender":"qa-fc4ae80018f6","body":"Sure, now works","createdAt":"2026-11-27T10:59:53.071339118Z"}
```

## 12. POST /v1/conversations/{id}/messages

```text
#12 POST http://localhost:7070/v1/conversations/cnv_f3da1691-598b-4d70-8c8d-6a6f06616421/messages
correlation: qa-97e5e2c5-c949-4c70-95ad-344602881ee5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-97e5e2c5-c949-4c70-95ad-344602881ee5
Content-Type: application/json

--- request body ---
{"body":"Calling you"}

--- response: 201 in 21 ms ---
Date: Fri, 27 Nov 2026 10:59:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-97e5e2c5-c949-4c70-95ad-344602881ee5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 54
RateLimit-Reset: 10
X-Served-Region: us
Content-Length: 202

{"id":"msg_cf9a8d41-b20d-4e44-aa83-519d4fb700fb","conversationId":"cnv_f3da1691-598b-4d70-8c8d-6a6f06616421","sender":"qa-fc4ae80018f6","body":"Calling you","createdAt":"2026-11-27T10:59:53.122164656Z"}
```

## 13. GET /v1/conversations/{id}

```text
#13 GET http://localhost:7070/v1/conversations/cnv_f3da1691-598b-4d70-8c8d-6a6f06616421
correlation: qa-281595ba-9c64-412f-b513-f8c7d644b83c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-281595ba-9c64-412f-b513-f8c7d644b83c
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Fri, 27 Nov 2026 10:59:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-281595ba-9c64-412f-b513-f8c7d644b83c
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
X-Data-Region: us
Content-Length: 238

{"id":"cnv_f3da1691-598b-4d70-8c8d-6a6f06616421","subject":"Project kickoff","status":"open","region":"us","participants":["qa-1be3834937d0","qa-fc4ae80018f6"],"messageCount":3,"unreadCount":2,"createdAt":"2026-11-27T10:59:52.533193934Z"}
```

## 14. GET /v1/conversations/{id}/messages

```text
#14 GET http://localhost:7070/v1/conversations/cnv_f3da1691-598b-4d70-8c8d-6a6f06616421/messages
correlation: qa-3be16f8e-cdd5-46b8-a2b4-f8b4aa15513c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3be16f8e-cdd5-46b8-a2b4-f8b4aa15513c
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Fri, 27 Nov 2026 10:59:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-3be16f8e-cdd5-46b8-a2b4-f8b4aa15513c
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
X-Served-Region: eu
Content-Length: 644

{"items":[{"id":"msg_bcf920f4-8099-4a73-aec6-201c4d0b78c8","conversationId":"cnv_f3da1691-598b-4d70-8c8d-6a6f06616421","sender":"qa-1be3834937d0","body":"Hi Ben, got a minute?","createdAt":"2026-11-27T10:59:52.533203127Z"},{"id":"msg_e49bfd24-9af2-4b4f-8fb1-331fc963af27","conversationId":"cnv_f3da1691-598b-4d70-8c8d-6a6f06616421","sender":"qa-fc4ae80018f6","body":"Sure, now works","createdAt":"2026-11-27T10:59:53.071339118Z"},{"id":"msg_cf9a8d41-b20d-4e44-aa83-519d4fb700fb","conversationId":"cnv_f3da1691-598b-4d70-8c8d-6a6f06616421","sender":"qa-fc4ae80018f6","body":"Calling you","createdAt":"2026-11-27T10:59:53.122164656Z"}],"total":3}
```

## 15. GET /v1/credits/balance

```text
#15 GET http://localhost:7070/v1/credits/balance
correlation: qa-722601f6-99b6-4931-bdeb-c462d73a5e46

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-722601f6-99b6-4931-bdeb-c462d73a5e46
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Fri, 27 Nov 2026 10:59:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-722601f6-99b6-4931-bdeb-c462d73a5e46
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 89

{"balance":4,"currency":"credits","accountId":"acc_0fa446cf-0346-4409-8302-aecdbe0322c3"}
```

## 16. GET /v1/credits/balance

```text
#16 GET http://localhost:7070/v1/credits/balance
correlation: qa-b9452119-c686-4a91-a47a-9d55177d9332

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b9452119-c686-4a91-a47a-9d55177d9332
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Fri, 27 Nov 2026 10:59:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-b9452119-c686-4a91-a47a-9d55177d9332
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 53
RateLimit-Reset: 10
X-Served-Region: us
Content-Length: 89

{"balance":3,"currency":"credits","accountId":"acc_1927bac1-70af-4c1d-9da6-5db56333c20b"}
```

## 17. POST /v1/auth/token

```text
#17 POST http://localhost:7070/v1/auth/token
correlation: qa-47d8e0b1-f3b5-4347-8d63-23f24e17829f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-47d8e0b1-f3b5-4347-8d63-23f24e17829f
Content-Type: application/json

--- request body ---
{"handle":"qa-165ff5e9328d","password":"****"}

--- response: 200 in 11 ms ---
Date: Fri, 27 Nov 2026 10:59:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-47d8e0b1-f3b5-4347-8d63-23f24e17829f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 561
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a989d590-fe08-4c5f-99cb-b8aa8bee4604"}
```

## 18. GET /v1/conversations/{id}

```text
#18 GET http://localhost:7070/v1/conversations/cnv_f3da1691-598b-4d70-8c8d-6a6f06616421
correlation: qa-5aa66b6e-1218-4149-bfe4-2243a6fac33d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5aa66b6e-1218-4149-bfe4-2243a6fac33d
Content-Type: application/json

--- response: 403 in 5 ms ---
Date: Fri, 27 Nov 2026 10:59:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5aa66b6e-1218-4149-bfe4-2243a6fac33d
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
Content-Length: 285

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_f3da1691-598b-4d70-8c8d-6a6f06616421","correlationId":"qa-5aa66b6e-1218-4149-bfe4-2243a6fac33d"}
```

## 19. GET /v1/conversations/{id}/messages

```text
#19 GET http://localhost:7070/v1/conversations/cnv_f3da1691-598b-4d70-8c8d-6a6f06616421/messages
correlation: qa-e13dfca8-52f8-4f0e-9daa-5ec49c246999

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e13dfca8-52f8-4f0e-9daa-5ec49c246999
Content-Type: application/json

--- response: 403 in 11 ms ---
Date: Fri, 27 Nov 2026 10:59:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e13dfca8-52f8-4f0e-9daa-5ec49c246999
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
Content-Length: 294

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_f3da1691-598b-4d70-8c8d-6a6f06616421/messages","correlationId":"qa-e13dfca8-52f8-4f0e-9daa-5ec49c246999"}
```

## 20. POST /v1/conversations/{id}/messages

```text
#20 POST http://localhost:7070/v1/conversations/cnv_f3da1691-598b-4d70-8c8d-6a6f06616421/messages
correlation: qa-9d335bcc-a5ef-4056-b68a-043f5868f383

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d335bcc-a5ef-4056-b68a-043f5868f383
Content-Type: application/json

--- request body ---
{"body":"Hello?"}

--- response: 403 in 10 ms ---
Date: Fri, 27 Nov 2026 10:59:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9d335bcc-a5ef-4056-b68a-043f5868f383
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
Content-Length: 294

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_f3da1691-598b-4d70-8c8d-6a6f06616421/messages","correlationId":"qa-9d335bcc-a5ef-4056-b68a-043f5868f383"}
```

## 21. GET /v1/conversations

```text
#21 GET http://localhost:7070/v1/conversations
correlation: qa-931e48e3-573c-403e-9094-c8470e70acb7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-931e48e3-573c-403e-9094-c8470e70acb7
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Fri, 27 Nov 2026 10:59:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-931e48e3-573c-403e-9094-c8470e70acb7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: in
Content-Length: 22

{"items":[],"total":0}
```

## 22. GET /v1/credits/balance

```text
#22 GET http://localhost:7070/v1/credits/balance
correlation: qa-81b1697f-57f8-44e9-abc1-091f24a5c9d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-81b1697f-57f8-44e9-abc1-091f24a5c9d7
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Fri, 27 Nov 2026 10:59:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-81b1697f-57f8-44e9-abc1-091f24a5c9d7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 55
RateLimit-Reset: 10
X-Served-Region: in
Content-Length: 89

{"balance":5,"currency":"credits","accountId":"acc_a989d590-fe08-4c5f-99cb-b8aa8bee4604"}
```

## 23. POST /v1/conversations/{id}/close

```text
#23 POST http://localhost:7070/v1/conversations/cnv_f3da1691-598b-4d70-8c8d-6a6f06616421/close
correlation: qa-cc74c7fa-765b-4e44-a113-e6859432e37a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc74c7fa-765b-4e44-a113-e6859432e37a
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Fri, 27 Nov 2026 10:59:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-cc74c7fa-765b-4e44-a113-e6859432e37a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 55
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 284

{"id":"cnv_f3da1691-598b-4d70-8c8d-6a6f06616421","subject":"Project kickoff","status":"closed","region":"us","participants":["qa-1be3834937d0","qa-fc4ae80018f6"],"messageCount":3,"unreadCount":2,"createdAt":"2026-11-27T10:59:52.533193934Z","closedAt":"2026-11-27T10:59:53.594646296Z"}
```

## 24. POST /v1/conversations/{id}/close

```text
#24 POST http://localhost:7070/v1/conversations/cnv_f3da1691-598b-4d70-8c8d-6a6f06616421/close
correlation: qa-8d37306a-1409-4e15-9217-9b9ff19a6d6d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8d37306a-1409-4e15-9217-9b9ff19a6d6d
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Fri, 27 Nov 2026 10:59:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-8d37306a-1409-4e15-9217-9b9ff19a6d6d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 54
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 284

{"id":"cnv_f3da1691-598b-4d70-8c8d-6a6f06616421","subject":"Project kickoff","status":"closed","region":"us","participants":["qa-1be3834937d0","qa-fc4ae80018f6"],"messageCount":3,"unreadCount":2,"createdAt":"2026-11-27T10:59:52.533193934Z","closedAt":"2026-11-27T10:59:53.594646296Z"}
```

## 25. GET /v1/conversations/{id}/messages

```text
#25 GET http://localhost:7070/v1/conversations/cnv_f3da1691-598b-4d70-8c8d-6a6f06616421/messages
correlation: qa-96d730e7-c082-4a87-a36a-71783a1d4198

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-96d730e7-c082-4a87-a36a-71783a1d4198
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Fri, 27 Nov 2026 10:59:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-96d730e7-c082-4a87-a36a-71783a1d4198
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 52
RateLimit-Reset: 10
X-Served-Region: us
Content-Length: 644

{"items":[{"id":"msg_bcf920f4-8099-4a73-aec6-201c4d0b78c8","conversationId":"cnv_f3da1691-598b-4d70-8c8d-6a6f06616421","sender":"qa-1be3834937d0","body":"Hi Ben, got a minute?","createdAt":"2026-11-27T10:59:52.533203127Z"},{"id":"msg_e49bfd24-9af2-4b4f-8fb1-331fc963af27","conversationId":"cnv_f3da1691-598b-4d70-8c8d-6a6f06616421","sender":"qa-fc4ae80018f6","body":"Sure, now works","createdAt":"2026-11-27T10:59:53.071339118Z"},{"id":"msg_cf9a8d41-b20d-4e44-aa83-519d4fb700fb","conversationId":"cnv_f3da1691-598b-4d70-8c8d-6a6f06616421","sender":"qa-fc4ae80018f6","body":"Calling you","createdAt":"2026-11-27T10:59:53.122164656Z"}],"total":3}
```

## 26. POST /v1/conversations/{id}/messages

```text
#26 POST http://localhost:7070/v1/conversations/cnv_f3da1691-598b-4d70-8c8d-6a6f06616421/messages
correlation: qa-693e2a89-1704-4f28-b7a0-edbadb0884e9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-693e2a89-1704-4f28-b7a0-edbadb0884e9
Content-Type: application/json

--- request body ---
{"body":"One more thing"}

--- response: 409 in 5 ms ---
Date: Fri, 27 Nov 2026 10:59:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-693e2a89-1704-4f28-b7a0-edbadb0884e9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 51
RateLimit-Reset: 10
X-Served-Region: us
Content-Length: 329

{"type":"https://reference-service.example/problems/conversation-closed","title":"Conversation closed","status":409,"detail":"The conversation has been closed and accepts no more messages.","instance":"/v1/conversations/cnv_f3da1691-598b-4d70-8c8d-6a6f06616421/messages","correlationId":"qa-693e2a89-1704-4f28-b7a0-edbadb0884e9"}
```

## 27. GET /v1/credits/balance

```text
#27 GET http://localhost:7070/v1/credits/balance
correlation: qa-343a4234-e1f5-4263-a385-70cf4a0f7d12

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-343a4234-e1f5-4263-a385-70cf4a0f7d12
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Fri, 27 Nov 2026 10:59:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-343a4234-e1f5-4263-a385-70cf4a0f7d12
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 50
RateLimit-Reset: 10
X-Served-Region: us
Content-Length: 89

{"balance":3,"currency":"credits","accountId":"acc_1927bac1-70af-4c1d-9da6-5db56333c20b"}
```

## 28. DELETE /v1/accounts/me

```text
#28 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0f6ea3cb-fd73-49c1-b302-192cf24108f1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f6ea3cb-fd73-49c1-b302-192cf24108f1
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Fri, 27 Nov 2026 10:59:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0f6ea3cb-fd73-49c1-b302-192cf24108f1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 54
RateLimit-Reset: 10
X-Served-Region: in
```

## 29. POST /v1/auth/token

```text
#29 POST http://localhost:7070/v1/auth/token
correlation: qa-7da1b01d-5938-4eb7-b69e-3974e2cdd245

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7da1b01d-5938-4eb7-b69e-3974e2cdd245
Content-Type: application/json

--- request body ---
{"handle":"qa-165ff5e9328d","password":"****"}

--- response: 401 in 6 ms ---
Date: Fri, 27 Nov 2026 10:59:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7da1b01d-5938-4eb7-b69e-3974e2cdd245
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 558
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7da1b01d-5938-4eb7-b69e-3974e2cdd245"}
```

## 30. DELETE /v1/accounts/me

```text
#30 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2fcdfa8a-30a2-4720-959b-c3e3736fc030

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2fcdfa8a-30a2-4720-959b-c3e3736fc030
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Fri, 27 Nov 2026 10:59:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2fcdfa8a-30a2-4720-959b-c3e3736fc030
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 49
RateLimit-Reset: 10
X-Served-Region: us
```

## 31. POST /v1/auth/token

```text
#31 POST http://localhost:7070/v1/auth/token
correlation: qa-f67a3879-1735-4a77-ac74-5dffe3a9f5c6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f67a3879-1735-4a77-ac74-5dffe3a9f5c6
Content-Type: application/json

--- request body ---
{"handle":"qa-fc4ae80018f6","password":"****"}

--- response: 401 in 4 ms ---
Date: Fri, 27 Nov 2026 10:59:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f67a3879-1735-4a77-ac74-5dffe3a9f5c6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 557
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f67a3879-1735-4a77-ac74-5dffe3a9f5c6"}
```

## 32. DELETE /v1/accounts/me

```text
#32 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b45629d5-b2b1-4866-8451-e9d7205c6dc6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b45629d5-b2b1-4866-8451-e9d7205c6dc6
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Fri, 27 Nov 2026 10:59:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b45629d5-b2b1-4866-8451-e9d7205c6dc6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 53
RateLimit-Reset: 9
X-Served-Region: eu
```

## 33. POST /v1/auth/token

```text
#33 POST http://localhost:7070/v1/auth/token
correlation: qa-62be042d-d3bc-4a53-9aa5-6acb0323f029

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-62be042d-d3bc-4a53-9aa5-6acb0323f029
Content-Type: application/json

--- request body ---
{"handle":"qa-1be3834937d0","password":"****"}

--- response: 401 in 4 ms ---
Date: Fri, 27 Nov 2026 10:59:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-62be042d-d3bc-4a53-9aa5-6acb0323f029
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 556
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-62be042d-d3bc-4a53-9aa5-6acb0323f029"}
```
