# Transcript: Every conversation operation answers an outsider with a 403 problem [GET /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[1]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 33 | `qa-8911c9f8-ecdb-44f1-998e-03218822083b` |
| 2 | `POST /v1/accounts` | 201 | 28 | `qa-ea46e32a-30f3-4f41-abab-b1123dc81d6d` |
| 3 | `POST /v1/accounts` | 201 | 28 | `qa-a77b3cae-afac-4a46-9535-63a3dcdbfcdb` |
| 4 | `POST /v1/auth/token` | 200 | 30 | `qa-539ac866-7160-4aaf-97a7-b16a8525e4dd` |
| 5 | `POST /v1/conversations` | 201 | 21 | `qa-fbb82bcf-ad06-4d8d-b3f6-625dc3ead6d8` |
| 6 | `POST /v1/auth/token` | 200 | 23 | `qa-30e6e444-7fa0-475d-8676-faf24f3ead95` |
| 7 | `GET /v1/conversations/{id}/messages` | 403 | 12 | `qa-1d420f1b-1333-42c7-b01a-efcacb183a0a` |
| 8 | `DELETE /v1/accounts/me` | 204 | 35 | `qa-ccffe54d-42be-40e6-8a1f-3412a93a9ee8` |
| 9 | `POST /v1/auth/token` | 401 | 30 | `qa-6fef1015-b47a-472e-b324-a45bca6d7cd2` |
| 10 | `POST /v1/auth/token` | 200 | 49 | `qa-5fab9d83-e91c-450f-99f1-e87e830ed032` |
| 11 | `DELETE /v1/accounts/me` | 204 | 38 | `qa-812ca5f7-f60e-466a-9ecc-3ab15a1c41e6` |
| 12 | `POST /v1/auth/token` | 401 | 36 | `qa-3758aa52-5e2e-4ed6-941b-5e5516e87cc3` |
| 13 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-ea21669c-30a6-4c86-b9f3-ffc23e509609` |
| 14 | `POST /v1/auth/token` | 401 | 33 | `qa-c3f42846-dc6f-48e8-9097-9d80e6a5919d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8911c9f8-ecdb-44f1-998e-03218822083b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8911c9f8-ecdb-44f1-998e-03218822083b
Content-Type: application/json

--- request body ---
{"handle":"qa-9f3a65699352","displayName":"QA 9f3a65699352","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-8911c9f8-ecdb-44f1-998e-03218822083b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 545
RateLimit-Reset: 9
Location: /v1/accounts/qa-9f3a65699352
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a4db3d4e-cacc-4d41-be1e-3abfe898e366","handle":"qa-9f3a65699352","displayName":"QA 9f3a65699352","region":"eu","role":"user","createdAt":"2026-11-26T11:02:43.888780223Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-ea46e32a-30f3-4f41-abab-b1123dc81d6d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ea46e32a-30f3-4f41-abab-b1123dc81d6d
Content-Type: application/json

--- request body ---
{"handle":"qa-1f53c27d8dd4","displayName":"QA 1f53c27d8dd4","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-ea46e32a-30f3-4f41-abab-b1123dc81d6d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 539
RateLimit-Reset: 9
Location: /v1/accounts/qa-1f53c27d8dd4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8638bb8c-3cc7-43c2-9f0f-b2c5707792ee","handle":"qa-1f53c27d8dd4","displayName":"QA 1f53c27d8dd4","region":"eu","role":"user","createdAt":"2026-11-26T11:02:43.939850155Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-a77b3cae-afac-4a46-9535-63a3dcdbfcdb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a77b3cae-afac-4a46-9535-63a3dcdbfcdb
Content-Type: application/json

--- request body ---
{"handle":"qa-e437c442170b","displayName":"QA e437c442170b","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-a77b3cae-afac-4a46-9535-63a3dcdbfcdb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 534
RateLimit-Reset: 9
Location: /v1/accounts/qa-e437c442170b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fe5f59fc-fe36-4672-b4f6-f2a0690cf143","handle":"qa-e437c442170b","displayName":"QA e437c442170b","region":"eu","role":"user","createdAt":"2026-11-26T11:02:43.992194253Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-539ac866-7160-4aaf-97a7-b16a8525e4dd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-539ac866-7160-4aaf-97a7-b16a8525e4dd
Content-Type: application/json

--- request body ---
{"handle":"qa-9f3a65699352","password":"****"}

--- response: 200 in 30 ms ---
Date: Thu, 26 Nov 2026 11:02:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-539ac866-7160-4aaf-97a7-b16a8525e4dd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 530
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a4db3d4e-cacc-4d41-be1e-3abfe898e366"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-fbb82bcf-ad06-4d8d-b3f6-625dc3ead6d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fbb82bcf-ad06-4d8d-b3f6-625dc3ead6d8
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-1f53c27d8dd4","subject":"Error contract","message":"Hi"}

--- response: 201 in 21 ms ---
Date: Thu, 26 Nov 2026 11:02:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-fbb82bcf-ad06-4d8d-b3f6-625dc3ead6d8
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
Location: /v1/conversations/cnv_3947c6e2-1fd7-4373-a526-01c3a6e4fa14
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_3947c6e2-1fd7-4373-a526-01c3a6e4fa14","subject":"Error contract","status":"open","region":"eu","participants":["qa-9f3a65699352","qa-1f53c27d8dd4"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-26T11:02:44.077010294Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-30e6e444-7fa0-475d-8676-faf24f3ead95

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-30e6e444-7fa0-475d-8676-faf24f3ead95
Content-Type: application/json

--- request body ---
{"handle":"qa-e437c442170b","password":"****"}

--- response: 200 in 23 ms ---
Date: Thu, 26 Nov 2026 11:02:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-30e6e444-7fa0-475d-8676-faf24f3ead95
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 526
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fe5f59fc-fe36-4672-b4f6-f2a0690cf143"}
```

## 7. GET /v1/conversations/{id}/messages

```text
#7 GET http://localhost:7070/v1/conversations/cnv_3947c6e2-1fd7-4373-a526-01c3a6e4fa14/messages
correlation: qa-1d420f1b-1333-42c7-b01a-efcacb183a0a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1d420f1b-1333-42c7-b01a-efcacb183a0a
Content-Type: application/json

--- response: 403 in 12 ms ---
Date: Thu, 26 Nov 2026 11:02:44 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1d420f1b-1333-42c7-b01a-efcacb183a0a
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
Content-Length: 294

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_3947c6e2-1fd7-4373-a526-01c3a6e4fa14/messages","correlationId":"qa-1d420f1b-1333-42c7-b01a-efcacb183a0a"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ccffe54d-42be-40e6-8a1f-3412a93a9ee8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ccffe54d-42be-40e6-8a1f-3412a93a9ee8
Content-Type: application/json

--- response: 204 in 35 ms ---
Date: Thu, 26 Nov 2026 11:02:44 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ccffe54d-42be-40e6-8a1f-3412a93a9ee8
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
correlation: qa-6fef1015-b47a-472e-b324-a45bca6d7cd2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6fef1015-b47a-472e-b324-a45bca6d7cd2
Content-Type: application/json

--- request body ---
{"handle":"qa-e437c442170b","password":"****"}

--- response: 401 in 30 ms ---
Date: Thu, 26 Nov 2026 11:02:44 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6fef1015-b47a-472e-b324-a45bca6d7cd2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 514
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6fef1015-b47a-472e-b324-a45bca6d7cd2"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-5fab9d83-e91c-450f-99f1-e87e830ed032

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5fab9d83-e91c-450f-99f1-e87e830ed032
Content-Type: application/json

--- request body ---
{"handle":"qa-1f53c27d8dd4","password":"****"}

--- response: 200 in 49 ms ---
Date: Thu, 26 Nov 2026 11:02:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-5fab9d83-e91c-450f-99f1-e87e830ed032
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8638bb8c-3cc7-43c2-9f0f-b2c5707792ee"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-812ca5f7-f60e-466a-9ecc-3ab15a1c41e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-812ca5f7-f60e-466a-9ecc-3ab15a1c41e6
Content-Type: application/json

--- response: 204 in 38 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-812ca5f7-f60e-466a-9ecc-3ab15a1c41e6
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

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-3758aa52-5e2e-4ed6-941b-5e5516e87cc3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3758aa52-5e2e-4ed6-941b-5e5516e87cc3
Content-Type: application/json

--- request body ---
{"handle":"qa-1f53c27d8dd4","password":"****"}

--- response: 401 in 36 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3758aa52-5e2e-4ed6-941b-5e5516e87cc3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 485
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3758aa52-5e2e-4ed6-941b-5e5516e87cc3"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ea21669c-30a6-4c86-b9f3-ffc23e509609

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ea21669c-30a6-4c86-b9f3-ffc23e509609
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ea21669c-30a6-4c86-b9f3-ffc23e509609
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-c3f42846-dc6f-48e8-9097-9d80e6a5919d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c3f42846-dc6f-48e8-9097-9d80e6a5919d
Content-Type: application/json

--- request body ---
{"handle":"qa-9f3a65699352","password":"****"}

--- response: 401 in 33 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c3f42846-dc6f-48e8-9097-9d80e6a5919d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 465
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c3f42846-dc6f-48e8-9097-9d80e6a5919d"}
```
