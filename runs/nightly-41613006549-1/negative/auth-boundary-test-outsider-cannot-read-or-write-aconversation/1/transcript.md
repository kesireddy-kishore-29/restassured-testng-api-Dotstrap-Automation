# Transcript: Someone outside a conversation gets 403, not its content

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.AuthBoundaryTest#outsiderCannotReadOrWriteAConversation` |
| Features | FEAT-AUTHZ-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 16 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 383 | `qa-4c7d1d83-f261-49f0-aff9-0fbccabae9f9` |
| 2 | `POST /v1/accounts` | 201 | 26 | `qa-a816b55e-ae1c-422d-85da-04401c7fb59c` |
| 3 | `POST /v1/accounts` | 201 | 25 | `qa-ebd6b912-4f26-4e98-a260-7652624d9f5c` |
| 4 | `POST /v1/auth/token` | 200 | 20 | `qa-dd8480ae-1087-4b20-97f7-4912f42f062d` |
| 5 | `POST /v1/conversations` | 201 | 25 | `qa-50f5bf4c-21d0-4bdc-b664-67f51ac3a505` |
| 6 | `POST /v1/auth/token` | 200 | 16 | `qa-9566a827-1365-4c71-8cd7-f49ca5056a41` |
| 7 | `GET /v1/conversations/{id}` | 403 | 17 | `qa-05533c6b-a616-4e01-b69a-d3470f4af7e7` |
| 8 | `GET /v1/conversations/{id}/messages` | 403 | 17 | `qa-b41bc61e-b5bb-4f8a-908a-0ddde8cf814b` |
| 9 | `POST /v1/conversations/{id}/messages` | 403 | 8 | `qa-e78c5e0c-3d63-45ac-8e96-3b9c552e372a` |
| 10 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-72d0619f-ba02-4e0c-9d39-0702b64fc109` |
| 11 | `POST /v1/auth/token` | 401 | 10 | `qa-5b1108e2-8b1d-4143-81e3-819f5267f602` |
| 12 | `POST /v1/auth/token` | 200 | 22 | `qa-893ec353-74c1-4b42-b12a-d6beaf6d07c6` |
| 13 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-b0bb3595-1496-4428-9dd3-a333a6671781` |
| 14 | `POST /v1/auth/token` | 401 | 15 | `qa-2e0b2237-16be-425c-95f0-d1881f1139ac` |
| 15 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-c04ab411-5ee3-41d4-befc-37f4cdac65a6` |
| 16 | `POST /v1/auth/token` | 401 | 16 | `qa-e01be4aa-db33-4168-bfa9-4aa2189f7a71` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4c7d1d83-f261-49f0-aff9-0fbccabae9f9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c7d1d83-f261-49f0-aff9-0fbccabae9f9
Content-Type: application/json

--- request body ---
{"handle":"qa-a9bf386e1236","displayName":"QA a9bf386e1236","password":"****","region":"eu"}

--- response: 201 in 383 ms ---
Date: Tue, 03 Nov 2026 09:41:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-4c7d1d83-f261-49f0-aff9-0fbccabae9f9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Location: /v1/accounts/qa-a9bf386e1236
X-Served-Region: eu
Content-Length: 181

{"id":"acc_da460766-aea5-4a1e-a261-11ab43165b67","handle":"qa-a9bf386e1236","displayName":"QA a9bf386e1236","region":"eu","role":"user","createdAt":"2026-11-03T09:41:36.455690735Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a816b55e-ae1c-422d-85da-04401c7fb59c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a816b55e-ae1c-422d-85da-04401c7fb59c
Content-Type: application/json

--- request body ---
{"handle":"qa-59be16707c05","displayName":"QA 59be16707c05","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Tue, 03 Nov 2026 09:41:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-a816b55e-ae1c-422d-85da-04401c7fb59c
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
Location: /v1/accounts/qa-59be16707c05
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0fbb456b-0477-4130-99ae-6e64af3713d6","handle":"qa-59be16707c05","displayName":"QA 59be16707c05","region":"eu","role":"user","createdAt":"2026-11-03T09:41:36.760385400Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-ebd6b912-4f26-4e98-a260-7652624d9f5c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ebd6b912-4f26-4e98-a260-7652624d9f5c
Content-Type: application/json

--- request body ---
{"handle":"qa-3d16077c84fa","displayName":"QA 3d16077c84fa","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Tue, 03 Nov 2026 09:41:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-ebd6b912-4f26-4e98-a260-7652624d9f5c
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
Location: /v1/accounts/qa-3d16077c84fa
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0c1e845d-24ad-4f76-9fda-17a988b5d9d4","handle":"qa-3d16077c84fa","displayName":"QA 3d16077c84fa","region":"eu","role":"user","createdAt":"2026-11-03T09:41:36.799839528Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-dd8480ae-1087-4b20-97f7-4912f42f062d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dd8480ae-1087-4b20-97f7-4912f42f062d
Content-Type: application/json

--- request body ---
{"handle":"qa-a9bf386e1236","password":"****"}

--- response: 200 in 20 ms ---
Date: Tue, 03 Nov 2026 09:41:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-dd8480ae-1087-4b20-97f7-4912f42f062d
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_da460766-aea5-4a1e-a261-11ab43165b67"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-50f5bf4c-21d0-4bdc-b664-67f51ac3a505

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-50f5bf4c-21d0-4bdc-b664-67f51ac3a505
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-59be16707c05","subject":"Private","message":"Just us"}

--- response: 201 in 25 ms ---
Date: Tue, 03 Nov 2026 09:41:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-50f5bf4c-21d0-4bdc-b664-67f51ac3a505
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
Location: /v1/conversations/cnv_f9d53aad-6824-4a41-b866-32a6481df393
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_f9d53aad-6824-4a41-b866-32a6481df393","subject":"Private","status":"open","region":"eu","participants":["qa-a9bf386e1236","qa-59be16707c05"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-03T09:41:36.875518266Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-9566a827-1365-4c71-8cd7-f49ca5056a41

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9566a827-1365-4c71-8cd7-f49ca5056a41
Content-Type: application/json

--- request body ---
{"handle":"qa-3d16077c84fa","password":"****"}

--- response: 200 in 16 ms ---
Date: Tue, 03 Nov 2026 09:41:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-9566a827-1365-4c71-8cd7-f49ca5056a41
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0c1e845d-24ad-4f76-9fda-17a988b5d9d4"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_f9d53aad-6824-4a41-b866-32a6481df393
correlation: qa-05533c6b-a616-4e01-b69a-d3470f4af7e7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-05533c6b-a616-4e01-b69a-d3470f4af7e7
Content-Type: application/json

--- response: 403 in 17 ms ---
Date: Tue, 03 Nov 2026 09:41:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-05533c6b-a616-4e01-b69a-d3470f4af7e7
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
Content-Length: 285

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_f9d53aad-6824-4a41-b866-32a6481df393","correlationId":"qa-05533c6b-a616-4e01-b69a-d3470f4af7e7"}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_f9d53aad-6824-4a41-b866-32a6481df393/messages
correlation: qa-b41bc61e-b5bb-4f8a-908a-0ddde8cf814b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b41bc61e-b5bb-4f8a-908a-0ddde8cf814b
Content-Type: application/json

--- response: 403 in 17 ms ---
Date: Tue, 03 Nov 2026 09:41:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b41bc61e-b5bb-4f8a-908a-0ddde8cf814b
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
Content-Length: 294

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_f9d53aad-6824-4a41-b866-32a6481df393/messages","correlationId":"qa-b41bc61e-b5bb-4f8a-908a-0ddde8cf814b"}
```

## 9. POST /v1/conversations/{id}/messages

```text
#9 POST http://localhost:7070/v1/conversations/cnv_f9d53aad-6824-4a41-b866-32a6481df393/messages
correlation: qa-e78c5e0c-3d63-45ac-8e96-3b9c552e372a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e78c5e0c-3d63-45ac-8e96-3b9c552e372a
Content-Type: application/json

--- request body ---
{"body":"Let me in"}

--- response: 403 in 8 ms ---
Date: Tue, 03 Nov 2026 09:41:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e78c5e0c-3d63-45ac-8e96-3b9c552e372a
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
Content-Length: 294

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_f9d53aad-6824-4a41-b866-32a6481df393/messages","correlationId":"qa-e78c5e0c-3d63-45ac-8e96-3b9c552e372a"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-72d0619f-ba02-4e0c-9d39-0702b64fc109

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-72d0619f-ba02-4e0c-9d39-0702b64fc109
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Tue, 03 Nov 2026 09:41:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-72d0619f-ba02-4e0c-9d39-0702b64fc109
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
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-5b1108e2-8b1d-4143-81e3-819f5267f602

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b1108e2-8b1d-4143-81e3-819f5267f602
Content-Type: application/json

--- request body ---
{"handle":"qa-3d16077c84fa","password":"****"}

--- response: 401 in 10 ms ---
Date: Tue, 03 Nov 2026 09:41:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5b1108e2-8b1d-4143-81e3-819f5267f602
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 589
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5b1108e2-8b1d-4143-81e3-819f5267f602"}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-893ec353-74c1-4b42-b12a-d6beaf6d07c6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-893ec353-74c1-4b42-b12a-d6beaf6d07c6
Content-Type: application/json

--- request body ---
{"handle":"qa-59be16707c05","password":"****"}

--- response: 200 in 22 ms ---
Date: Tue, 03 Nov 2026 09:41:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-893ec353-74c1-4b42-b12a-d6beaf6d07c6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 586
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0fbb456b-0477-4130-99ae-6e64af3713d6"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b0bb3595-1496-4428-9dd3-a333a6671781

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b0bb3595-1496-4428-9dd3-a333a6671781
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Tue, 03 Nov 2026 09:41:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b0bb3595-1496-4428-9dd3-a333a6671781
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

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-2e0b2237-16be-425c-95f0-d1881f1139ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e0b2237-16be-425c-95f0-d1881f1139ac
Content-Type: application/json

--- request body ---
{"handle":"qa-59be16707c05","password":"****"}

--- response: 401 in 15 ms ---
Date: Tue, 03 Nov 2026 09:41:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2e0b2237-16be-425c-95f0-d1881f1139ac
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 583
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2e0b2237-16be-425c-95f0-d1881f1139ac"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c04ab411-5ee3-41d4-befc-37f4cdac65a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c04ab411-5ee3-41d4-befc-37f4cdac65a6
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Tue, 03 Nov 2026 09:41:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c04ab411-5ee3-41d4-befc-37f4cdac65a6
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

## 16. POST /v1/auth/token

```text
#16 POST http://localhost:7070/v1/auth/token
correlation: qa-e01be4aa-db33-4168-bfa9-4aa2189f7a71

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e01be4aa-db33-4168-bfa9-4aa2189f7a71
Content-Type: application/json

--- request body ---
{"handle":"qa-a9bf386e1236","password":"****"}

--- response: 401 in 16 ms ---
Date: Tue, 03 Nov 2026 09:41:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e01be4aa-db33-4168-bfa9-4aa2189f7a71
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e01be4aa-db33-4168-bfa9-4aa2189f7a71"}
```
