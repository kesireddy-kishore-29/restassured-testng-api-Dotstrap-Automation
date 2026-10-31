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
| 1 | `POST /v1/accounts` | 201 | 389 | `qa-ce9e8ef5-ac20-4c5c-9a83-087257091d28` |
| 2 | `POST /v1/accounts` | 201 | 101 | `qa-ef35fbc2-9f36-438d-be20-32a198c80239` |
| 3 | `POST /v1/accounts` | 201 | 69 | `qa-47430476-8df3-4bd3-96f0-4c7d72f05911` |
| 4 | `POST /v1/auth/token` | 200 | 46 | `qa-d636ada5-144d-4cf0-9ca1-97e3b650c958` |
| 5 | `POST /v1/conversations` | 201 | 24 | `qa-efd33347-49a6-4266-aa54-11cce30551ea` |
| 6 | `POST /v1/auth/token` | 200 | 10 | `qa-46117e67-a9a1-4f78-aef6-21db4b79e317` |
| 7 | `GET /v1/conversations` | 200 | 10 | `qa-ad31356b-922b-4d43-9382-4036fe90a105` |
| 8 | `GET /v1/conversations/{id}/messages` | 200 | 21 | `qa-806ae2d7-e627-42d4-a09e-a68236af6147` |
| 9 | `POST /v1/conversations/{id}/read` | 200 | 21 | `qa-519977e8-c852-47bb-bc72-6f0de2a7dfe9` |
| 10 | `GET /v1/conversations/{id}` | 200 | 12 | `qa-481c4583-a9c9-4033-afe7-25911ab197b2` |
| 11 | `POST /v1/conversations/{id}/messages` | 201 | 15 | `qa-e5fc0cc8-cc95-43e3-9095-d8943341efcf` |
| 12 | `POST /v1/conversations/{id}/messages` | 201 | 13 | `qa-47a08a8e-5c0e-4ce0-9366-94f38fa1fddc` |
| 13 | `GET /v1/conversations/{id}` | 200 | 6 | `qa-6084a24c-e972-425a-a420-5472481c6264` |
| 14 | `GET /v1/conversations/{id}/messages` | 200 | 11 | `qa-58547c45-d0c1-4255-bd30-969a88b03d64` |
| 15 | `GET /v1/credits/balance` | 200 | 21 | `qa-e8b29873-29ca-44d7-9b83-bfc2cc6d3690` |
| 16 | `GET /v1/credits/balance` | 200 | 11 | `qa-d58cb49c-1bc3-4bf3-a511-2c295e7d3d20` |
| 17 | `POST /v1/auth/token` | 200 | 27 | `qa-d3f4de9e-8bc2-459a-9a68-3709e47cbfa6` |
| 18 | `GET /v1/conversations/{id}` | 403 | 5 | `qa-f79c2eff-45bb-40fd-95de-bc29ad2a69bb` |
| 19 | `GET /v1/conversations/{id}/messages` | 403 | 7 | `qa-df4b4205-81d6-4f81-8f81-4b46dc3face6` |
| 20 | `POST /v1/conversations/{id}/messages` | 403 | 8 | `qa-282883d1-c5f4-4b56-afd0-298255a5cebc` |
| 21 | `GET /v1/conversations` | 200 | 6 | `qa-5bdbf9bd-12a8-4054-b6c9-24c67d2882d0` |
| 22 | `GET /v1/credits/balance` | 200 | 4 | `qa-7e302cd1-8d78-4cc9-afd3-4d60dfd6aba0` |
| 23 | `POST /v1/conversations/{id}/close` | 200 | 7 | `qa-73955144-b965-4d40-ade5-556a56dad9cb` |
| 24 | `POST /v1/conversations/{id}/close` | 200 | 7 | `qa-d467c434-edc0-4053-badf-200dba5785b7` |
| 25 | `GET /v1/conversations/{id}/messages` | 200 | 6 | `qa-755ae728-1e1b-4787-bf72-f388d3858085` |
| 26 | `POST /v1/conversations/{id}/messages` | 409 | 5 | `qa-cb0aad95-ab35-4a19-9670-1ee4ebb1ae6b` |
| 27 | `GET /v1/credits/balance` | 200 | 6 | `qa-613f11cb-f216-47ac-998c-a3145e824957` |
| 28 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-4f911b6e-bea1-4341-af66-7702e0ad2c67` |
| 29 | `POST /v1/auth/token` | 401 | 20 | `qa-c297b8b0-dd7b-47ab-88e5-0079c35f1506` |
| 30 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-13ed0975-6fc2-4d3c-9bfc-fe7b18339851` |
| 31 | `POST /v1/auth/token` | 401 | 4 | `qa-633ff5fb-85fd-49cb-af11-8c46e554dc31` |
| 32 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-3b270f25-758d-495f-8576-2c998bb48c07` |
| 33 | `POST /v1/auth/token` | 401 | 4 | `qa-ecf96290-1749-41b8-adb8-fa6646779de7` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ce9e8ef5-ac20-4c5c-9a83-087257091d28

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce9e8ef5-ac20-4c5c-9a83-087257091d28
Content-Type: application/json

--- request body ---
{"handle":"qa-458270f2e5b7","displayName":"QA 458270f2e5b7","password":"****","region":"eu"}

--- response: 201 in 389 ms ---
Date: Fri, 23 Oct 2026 07:41:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-ce9e8ef5-ac20-4c5c-9a83-087257091d28
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
Location: /v1/accounts/qa-458270f2e5b7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a660da4e-ba11-4065-a0a9-18816cd343de","handle":"qa-458270f2e5b7","displayName":"QA 458270f2e5b7","region":"eu","role":"user","createdAt":"2026-10-23T07:41:44.587976540Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-ef35fbc2-9f36-438d-be20-32a198c80239

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef35fbc2-9f36-438d-be20-32a198c80239
Content-Type: application/json

--- request body ---
{"handle":"qa-51916e10a571","displayName":"QA 51916e10a571","password":"****","region":"us"}

--- response: 201 in 101 ms ---
Date: Fri, 23 Oct 2026 07:41:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-ef35fbc2-9f36-438d-be20-32a198c80239
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 595
RateLimit-Reset: 10
Location: /v1/accounts/qa-51916e10a571
X-Served-Region: us
Content-Length: 181

{"id":"acc_71abb667-d890-40af-b9b8-d3f597efe67c","handle":"qa-51916e10a571","displayName":"QA 51916e10a571","region":"us","role":"user","createdAt":"2026-10-23T07:41:45.015283413Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-47430476-8df3-4bd3-96f0-4c7d72f05911

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-47430476-8df3-4bd3-96f0-4c7d72f05911
Content-Type: application/json

--- request body ---
{"handle":"qa-dbc8f0b49790","displayName":"QA dbc8f0b49790","password":"****","region":"in"}

--- response: 201 in 69 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-47430476-8df3-4bd3-96f0-4c7d72f05911
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
Location: /v1/accounts/qa-dbc8f0b49790
X-Served-Region: in
Content-Length: 181

{"id":"acc_c5effa93-b9cd-4bed-b51d-234b3c00aacc","handle":"qa-dbc8f0b49790","displayName":"QA dbc8f0b49790","region":"in","role":"user","createdAt":"2026-10-23T07:41:45.122491777Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-d636ada5-144d-4cf0-9ca1-97e3b650c958

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d636ada5-144d-4cf0-9ca1-97e3b650c958
Content-Type: application/json

--- request body ---
{"handle":"qa-458270f2e5b7","password":"****"}

--- response: 200 in 46 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-d636ada5-144d-4cf0-9ca1-97e3b650c958
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a660da4e-ba11-4065-a0a9-18816cd343de"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-efd33347-49a6-4266-aa54-11cce30551ea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-efd33347-49a6-4266-aa54-11cce30551ea
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-51916e10a571","subject":"Project kickoff","message":"Hi Ben, got a minute?"}

--- response: 201 in 24 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-efd33347-49a6-4266-aa54-11cce30551ea
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
Location: /v1/conversations/cnv_1e5d5292-d1c0-4052-bc1f-52897317b772
X-Data-Region: us
Content-Length: 238

{"id":"cnv_1e5d5292-d1c0-4052-bc1f-52897317b772","subject":"Project kickoff","status":"open","region":"us","participants":["qa-458270f2e5b7","qa-51916e10a571"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-23T07:41:45.261905923Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-46117e67-a9a1-4f78-aef6-21db4b79e317

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-46117e67-a9a1-4f78-aef6-21db4b79e317
Content-Type: application/json

--- request body ---
{"handle":"qa-51916e10a571","password":"****"}

--- response: 200 in 10 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-46117e67-a9a1-4f78-aef6-21db4b79e317
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_71abb667-d890-40af-b9b8-d3f597efe67c"}
```

## 7. GET /v1/conversations

```text
#7 GET http://localhost:7070/v1/conversations
correlation: qa-ad31356b-922b-4d43-9382-4036fe90a105

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ad31356b-922b-4d43-9382-4036fe90a105
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-ad31356b-922b-4d43-9382-4036fe90a105
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

{"items":[{"id":"cnv_1e5d5292-d1c0-4052-bc1f-52897317b772","subject":"Project kickoff","status":"open","region":"us","participants":["qa-458270f2e5b7","qa-51916e10a571"],"messageCount":1,"unreadCount":1,"createdAt":"2026-10-23T07:41:45.261905923Z"}],"total":1}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_1e5d5292-d1c0-4052-bc1f-52897317b772/messages
correlation: qa-806ae2d7-e627-42d4-a09e-a68236af6147

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-806ae2d7-e627-42d4-a09e-a68236af6147
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-806ae2d7-e627-42d4-a09e-a68236af6147
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

{"items":[{"id":"msg_9f147de5-a839-4580-81c3-90d2a3e53a0b","conversationId":"cnv_1e5d5292-d1c0-4052-bc1f-52897317b772","sender":"qa-458270f2e5b7","body":"Hi Ben, got a minute?","createdAt":"2026-10-23T07:41:45.261935659Z"}],"total":1}
```

## 9. POST /v1/conversations/{id}/read

```text
#9 POST http://localhost:7070/v1/conversations/cnv_1e5d5292-d1c0-4052-bc1f-52897317b772/read
correlation: qa-519977e8-c852-47bb-bc72-6f0de2a7dfe9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-519977e8-c852-47bb-bc72-6f0de2a7dfe9
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-519977e8-c852-47bb-bc72-6f0de2a7dfe9
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

{"conversationId":"cnv_1e5d5292-d1c0-4052-bc1f-52897317b772","unreadCount":0}
```

## 10. GET /v1/conversations/{id}

```text
#10 GET http://localhost:7070/v1/conversations/cnv_1e5d5292-d1c0-4052-bc1f-52897317b772
correlation: qa-481c4583-a9c9-4033-afe7-25911ab197b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-481c4583-a9c9-4033-afe7-25911ab197b2
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-481c4583-a9c9-4033-afe7-25911ab197b2
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

{"id":"cnv_1e5d5292-d1c0-4052-bc1f-52897317b772","subject":"Project kickoff","status":"open","region":"us","participants":["qa-458270f2e5b7","qa-51916e10a571"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-23T07:41:45.261905923Z"}
```

## 11. POST /v1/conversations/{id}/messages

```text
#11 POST http://localhost:7070/v1/conversations/cnv_1e5d5292-d1c0-4052-bc1f-52897317b772/messages
correlation: qa-e5fc0cc8-cc95-43e3-9095-d8943341efcf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e5fc0cc8-cc95-43e3-9095-d8943341efcf
Content-Type: application/json

--- request body ---
{"body":"Sure, now works"}

--- response: 201 in 15 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-e5fc0cc8-cc95-43e3-9095-d8943341efcf
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

{"id":"msg_e8c28db2-613a-40df-80a1-b3c780bab0f5","conversationId":"cnv_1e5d5292-d1c0-4052-bc1f-52897317b772","sender":"qa-51916e10a571","body":"Sure, now works","createdAt":"2026-10-23T07:41:45.658511374Z"}
```

## 12. POST /v1/conversations/{id}/messages

```text
#12 POST http://localhost:7070/v1/conversations/cnv_1e5d5292-d1c0-4052-bc1f-52897317b772/messages
correlation: qa-47a08a8e-5c0e-4ce0-9366-94f38fa1fddc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-47a08a8e-5c0e-4ce0-9366-94f38fa1fddc
Content-Type: application/json

--- request body ---
{"body":"Calling you"}

--- response: 201 in 13 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-47a08a8e-5c0e-4ce0-9366-94f38fa1fddc
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

{"id":"msg_802b0348-a42d-42bd-ab86-6e6f1534a265","conversationId":"cnv_1e5d5292-d1c0-4052-bc1f-52897317b772","sender":"qa-51916e10a571","body":"Calling you","createdAt":"2026-10-23T07:41:45.692134927Z"}
```

## 13. GET /v1/conversations/{id}

```text
#13 GET http://localhost:7070/v1/conversations/cnv_1e5d5292-d1c0-4052-bc1f-52897317b772
correlation: qa-6084a24c-e972-425a-a420-5472481c6264

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6084a24c-e972-425a-a420-5472481c6264
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-6084a24c-e972-425a-a420-5472481c6264
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

{"id":"cnv_1e5d5292-d1c0-4052-bc1f-52897317b772","subject":"Project kickoff","status":"open","region":"us","participants":["qa-458270f2e5b7","qa-51916e10a571"],"messageCount":3,"unreadCount":2,"createdAt":"2026-10-23T07:41:45.261905923Z"}
```

## 14. GET /v1/conversations/{id}/messages

```text
#14 GET http://localhost:7070/v1/conversations/cnv_1e5d5292-d1c0-4052-bc1f-52897317b772/messages
correlation: qa-58547c45-d0c1-4255-bd30-969a88b03d64

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-58547c45-d0c1-4255-bd30-969a88b03d64
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-58547c45-d0c1-4255-bd30-969a88b03d64
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

{"items":[{"id":"msg_9f147de5-a839-4580-81c3-90d2a3e53a0b","conversationId":"cnv_1e5d5292-d1c0-4052-bc1f-52897317b772","sender":"qa-458270f2e5b7","body":"Hi Ben, got a minute?","createdAt":"2026-10-23T07:41:45.261935659Z"},{"id":"msg_e8c28db2-613a-40df-80a1-b3c780bab0f5","conversationId":"cnv_1e5d5292-d1c0-4052-bc1f-52897317b772","sender":"qa-51916e10a571","body":"Sure, now works","createdAt":"2026-10-23T07:41:45.658511374Z"},{"id":"msg_802b0348-a42d-42bd-ab86-6e6f1534a265","conversationId":"cnv_1e5d5292-d1c0-4052-bc1f-52897317b772","sender":"qa-51916e10a571","body":"Calling you","createdAt":"2026-10-23T07:41:45.692134927Z"}],"total":3}
```

## 15. GET /v1/credits/balance

```text
#15 GET http://localhost:7070/v1/credits/balance
correlation: qa-e8b29873-29ca-44d7-9b83-bfc2cc6d3690

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e8b29873-29ca-44d7-9b83-bfc2cc6d3690
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-e8b29873-29ca-44d7-9b83-bfc2cc6d3690
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

{"balance":4,"currency":"credits","accountId":"acc_a660da4e-ba11-4065-a0a9-18816cd343de"}
```

## 16. GET /v1/credits/balance

```text
#16 GET http://localhost:7070/v1/credits/balance
correlation: qa-d58cb49c-1bc3-4bf3-a511-2c295e7d3d20

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d58cb49c-1bc3-4bf3-a511-2c295e7d3d20
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-d58cb49c-1bc3-4bf3-a511-2c295e7d3d20
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

{"balance":3,"currency":"credits","accountId":"acc_71abb667-d890-40af-b9b8-d3f597efe67c"}
```

## 17. POST /v1/auth/token

```text
#17 POST http://localhost:7070/v1/auth/token
correlation: qa-d3f4de9e-8bc2-459a-9a68-3709e47cbfa6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d3f4de9e-8bc2-459a-9a68-3709e47cbfa6
Content-Type: application/json

--- request body ---
{"handle":"qa-dbc8f0b49790","password":"****"}

--- response: 200 in 27 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-d3f4de9e-8bc2-459a-9a68-3709e47cbfa6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 569
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c5effa93-b9cd-4bed-b51d-234b3c00aacc"}
```

## 18. GET /v1/conversations/{id}

```text
#18 GET http://localhost:7070/v1/conversations/cnv_1e5d5292-d1c0-4052-bc1f-52897317b772
correlation: qa-f79c2eff-45bb-40fd-95de-bc29ad2a69bb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f79c2eff-45bb-40fd-95de-bc29ad2a69bb
Content-Type: application/json

--- response: 403 in 5 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f79c2eff-45bb-40fd-95de-bc29ad2a69bb
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_1e5d5292-d1c0-4052-bc1f-52897317b772","correlationId":"qa-f79c2eff-45bb-40fd-95de-bc29ad2a69bb"}
```

## 19. GET /v1/conversations/{id}/messages

```text
#19 GET http://localhost:7070/v1/conversations/cnv_1e5d5292-d1c0-4052-bc1f-52897317b772/messages
correlation: qa-df4b4205-81d6-4f81-8f81-4b46dc3face6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df4b4205-81d6-4f81-8f81-4b46dc3face6
Content-Type: application/json

--- response: 403 in 7 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-df4b4205-81d6-4f81-8f81-4b46dc3face6
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_1e5d5292-d1c0-4052-bc1f-52897317b772/messages","correlationId":"qa-df4b4205-81d6-4f81-8f81-4b46dc3face6"}
```

## 20. POST /v1/conversations/{id}/messages

```text
#20 POST http://localhost:7070/v1/conversations/cnv_1e5d5292-d1c0-4052-bc1f-52897317b772/messages
correlation: qa-282883d1-c5f4-4b56-afd0-298255a5cebc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-282883d1-c5f4-4b56-afd0-298255a5cebc
Content-Type: application/json

--- request body ---
{"body":"Hello?"}

--- response: 403 in 8 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-282883d1-c5f4-4b56-afd0-298255a5cebc
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_1e5d5292-d1c0-4052-bc1f-52897317b772/messages","correlationId":"qa-282883d1-c5f4-4b56-afd0-298255a5cebc"}
```

## 21. GET /v1/conversations

```text
#21 GET http://localhost:7070/v1/conversations
correlation: qa-5bdbf9bd-12a8-4054-b6c9-24c67d2882d0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5bdbf9bd-12a8-4054-b6c9-24c67d2882d0
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-5bdbf9bd-12a8-4054-b6c9-24c67d2882d0
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
correlation: qa-7e302cd1-8d78-4cc9-afd3-4d60dfd6aba0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e302cd1-8d78-4cc9-afd3-4d60dfd6aba0
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-7e302cd1-8d78-4cc9-afd3-4d60dfd6aba0
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

{"balance":5,"currency":"credits","accountId":"acc_c5effa93-b9cd-4bed-b51d-234b3c00aacc"}
```

## 23. POST /v1/conversations/{id}/close

```text
#23 POST http://localhost:7070/v1/conversations/cnv_1e5d5292-d1c0-4052-bc1f-52897317b772/close
correlation: qa-73955144-b965-4d40-ade5-556a56dad9cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-73955144-b965-4d40-ade5-556a56dad9cb
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-73955144-b965-4d40-ade5-556a56dad9cb
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

{"id":"cnv_1e5d5292-d1c0-4052-bc1f-52897317b772","subject":"Project kickoff","status":"closed","region":"us","participants":["qa-458270f2e5b7","qa-51916e10a571"],"messageCount":3,"unreadCount":2,"createdAt":"2026-10-23T07:41:45.261905923Z","closedAt":"2026-10-23T07:41:46.714200239Z"}
```

## 24. POST /v1/conversations/{id}/close

```text
#24 POST http://localhost:7070/v1/conversations/cnv_1e5d5292-d1c0-4052-bc1f-52897317b772/close
correlation: qa-d467c434-edc0-4053-badf-200dba5785b7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d467c434-edc0-4053-badf-200dba5785b7
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-d467c434-edc0-4053-badf-200dba5785b7
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

{"id":"cnv_1e5d5292-d1c0-4052-bc1f-52897317b772","subject":"Project kickoff","status":"closed","region":"us","participants":["qa-458270f2e5b7","qa-51916e10a571"],"messageCount":3,"unreadCount":2,"createdAt":"2026-10-23T07:41:45.261905923Z","closedAt":"2026-10-23T07:41:46.714200239Z"}
```

## 25. GET /v1/conversations/{id}/messages

```text
#25 GET http://localhost:7070/v1/conversations/cnv_1e5d5292-d1c0-4052-bc1f-52897317b772/messages
correlation: qa-755ae728-1e1b-4787-bf72-f388d3858085

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-755ae728-1e1b-4787-bf72-f388d3858085
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-755ae728-1e1b-4787-bf72-f388d3858085
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 52
RateLimit-Reset: 9
X-Served-Region: us
Content-Length: 644

{"items":[{"id":"msg_9f147de5-a839-4580-81c3-90d2a3e53a0b","conversationId":"cnv_1e5d5292-d1c0-4052-bc1f-52897317b772","sender":"qa-458270f2e5b7","body":"Hi Ben, got a minute?","createdAt":"2026-10-23T07:41:45.261935659Z"},{"id":"msg_e8c28db2-613a-40df-80a1-b3c780bab0f5","conversationId":"cnv_1e5d5292-d1c0-4052-bc1f-52897317b772","sender":"qa-51916e10a571","body":"Sure, now works","createdAt":"2026-10-23T07:41:45.658511374Z"},{"id":"msg_802b0348-a42d-42bd-ab86-6e6f1534a265","conversationId":"cnv_1e5d5292-d1c0-4052-bc1f-52897317b772","sender":"qa-51916e10a571","body":"Calling you","createdAt":"2026-10-23T07:41:45.692134927Z"}],"total":3}
```

## 26. POST /v1/conversations/{id}/messages

```text
#26 POST http://localhost:7070/v1/conversations/cnv_1e5d5292-d1c0-4052-bc1f-52897317b772/messages
correlation: qa-cb0aad95-ab35-4a19-9670-1ee4ebb1ae6b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb0aad95-ab35-4a19-9670-1ee4ebb1ae6b
Content-Type: application/json

--- request body ---
{"body":"One more thing"}

--- response: 409 in 5 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cb0aad95-ab35-4a19-9670-1ee4ebb1ae6b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 51
RateLimit-Reset: 9
X-Served-Region: us
Content-Length: 329

{"type":"https://reference-service.example/problems/conversation-closed","title":"Conversation closed","status":409,"detail":"The conversation has been closed and accepts no more messages.","instance":"/v1/conversations/cnv_1e5d5292-d1c0-4052-bc1f-52897317b772/messages","correlationId":"qa-cb0aad95-ab35-4a19-9670-1ee4ebb1ae6b"}
```

## 27. GET /v1/credits/balance

```text
#27 GET http://localhost:7070/v1/credits/balance
correlation: qa-613f11cb-f216-47ac-998c-a3145e824957

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-613f11cb-f216-47ac-998c-a3145e824957
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-613f11cb-f216-47ac-998c-a3145e824957
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 50
RateLimit-Reset: 9
X-Served-Region: us
Content-Length: 89

{"balance":3,"currency":"credits","accountId":"acc_71abb667-d890-40af-b9b8-d3f597efe67c"}
```

## 28. DELETE /v1/accounts/me

```text
#28 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4f911b6e-bea1-4341-af66-7702e0ad2c67

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f911b6e-bea1-4341-af66-7702e0ad2c67
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4f911b6e-bea1-4341-af66-7702e0ad2c67
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
correlation: qa-c297b8b0-dd7b-47ab-88e5-0079c35f1506

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c297b8b0-dd7b-47ab-88e5-0079c35f1506
Content-Type: application/json

--- request body ---
{"handle":"qa-dbc8f0b49790","password":"****"}

--- response: 401 in 20 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c297b8b0-dd7b-47ab-88e5-0079c35f1506
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 558
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c297b8b0-dd7b-47ab-88e5-0079c35f1506"}
```

## 30. DELETE /v1/accounts/me

```text
#30 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-13ed0975-6fc2-4d3c-9bfc-fe7b18339851

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-13ed0975-6fc2-4d3c-9bfc-fe7b18339851
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: text/plain
X-Correlation-Id: qa-13ed0975-6fc2-4d3c-9bfc-fe7b18339851
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 49
RateLimit-Reset: 9
X-Served-Region: us
```

## 31. POST /v1/auth/token

```text
#31 POST http://localhost:7070/v1/auth/token
correlation: qa-633ff5fb-85fd-49cb-af11-8c46e554dc31

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-633ff5fb-85fd-49cb-af11-8c46e554dc31
Content-Type: application/json

--- request body ---
{"handle":"qa-51916e10a571","password":"****"}

--- response: 401 in 4 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-633ff5fb-85fd-49cb-af11-8c46e554dc31
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 557
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-633ff5fb-85fd-49cb-af11-8c46e554dc31"}
```

## 32. DELETE /v1/accounts/me

```text
#32 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3b270f25-758d-495f-8576-2c998bb48c07

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3b270f25-758d-495f-8576-2c998bb48c07
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3b270f25-758d-495f-8576-2c998bb48c07
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
correlation: qa-ecf96290-1749-41b8-adb8-fa6646779de7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ecf96290-1749-41b8-adb8-fa6646779de7
Content-Type: application/json

--- request body ---
{"handle":"qa-458270f2e5b7","password":"****"}

--- response: 401 in 4 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ecf96290-1749-41b8-adb8-fa6646779de7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 556
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ecf96290-1749-41b8-adb8-fa6646779de7"}
```
