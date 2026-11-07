# Transcript: Every conversation operation answers an outsider with a 403 problem [POST /v1/conversations/{id}/read]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[3]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 384 | `qa-c115af5b-f086-4bfe-89c5-634f7ec1d9dc` |
| 2 | `POST /v1/accounts` | 201 | 28 | `qa-190dbfb7-5377-4620-a211-70f24ea73a11` |
| 3 | `POST /v1/accounts` | 201 | 37 | `qa-0de7a149-cacf-4e8f-81c7-55f5c65ff5c9` |
| 4 | `POST /v1/auth/token` | 200 | 39 | `qa-e3aa0cdd-0291-489f-88e7-53c780404ac1` |
| 5 | `POST /v1/conversations` | 201 | 45 | `qa-9ad97578-a1c5-402a-b68e-201335f3e759` |
| 6 | `POST /v1/auth/token` | 200 | 29 | `qa-fab02e46-9482-4cbf-a7ea-c572162836da` |
| 7 | `POST /v1/conversations/{id}/read` | 403 | 27 | `qa-cb0ee6bc-ae81-4331-848b-6bfcf82101e1` |
| 8 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-dd133e52-f748-4194-842b-1b1563152669` |
| 9 | `POST /v1/auth/token` | 401 | 15 | `qa-0aac1c3e-d9b9-4172-8b89-78e5d4191ff8` |
| 10 | `POST /v1/auth/token` | 200 | 54 | `qa-ebb5b712-9d9b-46bc-ab32-1c02b592d793` |
| 11 | `DELETE /v1/accounts/me` | 204 | 27 | `qa-19327c01-1a6f-492a-be7f-3a8bf62b9336` |
| 12 | `POST /v1/auth/token` | 401 | 15 | `qa-1f020d6f-4b5a-4f7b-b0f5-6b70924d0775` |
| 13 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-de1dbafe-917b-419d-b157-44ab59df149a` |
| 14 | `POST /v1/auth/token` | 401 | 12 | `qa-1ea34e37-4bd8-4f97-a4c0-a472e4ef9169` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c115af5b-f086-4bfe-89c5-634f7ec1d9dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c115af5b-f086-4bfe-89c5-634f7ec1d9dc
Content-Type: application/json

--- request body ---
{"handle":"qa-ac38502eac28","displayName":"QA ac38502eac28","password":"****","region":"eu"}

--- response: 201 in 384 ms ---
Date: Tue, 03 Nov 2026 09:41:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-c115af5b-f086-4bfe-89c5-634f7ec1d9dc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 10
Location: /v1/accounts/qa-ac38502eac28
X-Served-Region: eu
Content-Length: 181

{"id":"acc_45d45809-a638-4ece-af0a-671c91c23bc8","handle":"qa-ac38502eac28","displayName":"QA ac38502eac28","region":"eu","role":"user","createdAt":"2026-11-03T09:41:30.883355410Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-190dbfb7-5377-4620-a211-70f24ea73a11

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-190dbfb7-5377-4620-a211-70f24ea73a11
Content-Type: application/json

--- request body ---
{"handle":"qa-73720a143e76","displayName":"QA 73720a143e76","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Tue, 03 Nov 2026 09:41:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-190dbfb7-5377-4620-a211-70f24ea73a11
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
Location: /v1/accounts/qa-73720a143e76
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f137b684-528d-4c46-b648-4e09c4262385","handle":"qa-73720a143e76","displayName":"QA 73720a143e76","region":"eu","role":"user","createdAt":"2026-11-03T09:41:31.213479841Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-0de7a149-cacf-4e8f-81c7-55f5c65ff5c9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0de7a149-cacf-4e8f-81c7-55f5c65ff5c9
Content-Type: application/json

--- request body ---
{"handle":"qa-e001265522bf","displayName":"QA e001265522bf","password":"****","region":"eu"}

--- response: 201 in 37 ms ---
Date: Tue, 03 Nov 2026 09:41:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-0de7a149-cacf-4e8f-81c7-55f5c65ff5c9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 567
RateLimit-Reset: 10
Location: /v1/accounts/qa-e001265522bf
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7f297a2f-38c7-4c35-bc2c-586fb9c6c970","handle":"qa-e001265522bf","displayName":"QA e001265522bf","region":"eu","role":"user","createdAt":"2026-11-03T09:41:31.289596272Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-e3aa0cdd-0291-489f-88e7-53c780404ac1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e3aa0cdd-0291-489f-88e7-53c780404ac1
Content-Type: application/json

--- request body ---
{"handle":"qa-ac38502eac28","password":"****"}

--- response: 200 in 39 ms ---
Date: Tue, 03 Nov 2026 09:41:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-e3aa0cdd-0291-489f-88e7-53c780404ac1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 557
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_45d45809-a638-4ece-af0a-671c91c23bc8"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-9ad97578-a1c5-402a-b68e-201335f3e759

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ad97578-a1c5-402a-b68e-201335f3e759
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-73720a143e76","subject":"Error contract","message":"Hi"}

--- response: 201 in 45 ms ---
Date: Tue, 03 Nov 2026 09:41:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-9ad97578-a1c5-402a-b68e-201335f3e759
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
Location: /v1/conversations/cnv_04016c74-bf51-4798-8c51-2a502bc38872
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_04016c74-bf51-4798-8c51-2a502bc38872","subject":"Error contract","status":"open","region":"eu","participants":["qa-ac38502eac28","qa-73720a143e76"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-03T09:41:31.399193967Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-fab02e46-9482-4cbf-a7ea-c572162836da

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fab02e46-9482-4cbf-a7ea-c572162836da
Content-Type: application/json

--- request body ---
{"handle":"qa-e001265522bf","password":"****"}

--- response: 200 in 29 ms ---
Date: Tue, 03 Nov 2026 09:41:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-fab02e46-9482-4cbf-a7ea-c572162836da
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 554
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7f297a2f-38c7-4c35-bc2c-586fb9c6c970"}
```

## 7. POST /v1/conversations/{id}/read

```text
#7 POST http://localhost:7070/v1/conversations/cnv_04016c74-bf51-4798-8c51-2a502bc38872/read
correlation: qa-cb0ee6bc-ae81-4331-848b-6bfcf82101e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb0ee6bc-ae81-4331-848b-6bfcf82101e1
Content-Type: application/json

--- response: 403 in 27 ms ---
Date: Tue, 03 Nov 2026 09:41:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cb0ee6bc-ae81-4331-848b-6bfcf82101e1
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
Content-Length: 290

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_04016c74-bf51-4798-8c51-2a502bc38872/read","correlationId":"qa-cb0ee6bc-ae81-4331-848b-6bfcf82101e1"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-dd133e52-f748-4194-842b-1b1563152669

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dd133e52-f748-4194-842b-1b1563152669
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-dd133e52-f748-4194-842b-1b1563152669
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
correlation: qa-0aac1c3e-d9b9-4172-8b89-78e5d4191ff8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0aac1c3e-d9b9-4172-8b89-78e5d4191ff8
Content-Type: application/json

--- request body ---
{"handle":"qa-e001265522bf","password":"****"}

--- response: 401 in 15 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0aac1c3e-d9b9-4172-8b89-78e5d4191ff8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 532
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0aac1c3e-d9b9-4172-8b89-78e5d4191ff8"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-ebb5b712-9d9b-46bc-ab32-1c02b592d793

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ebb5b712-9d9b-46bc-ab32-1c02b592d793
Content-Type: application/json

--- request body ---
{"handle":"qa-73720a143e76","password":"****"}

--- response: 200 in 54 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-ebb5b712-9d9b-46bc-ab32-1c02b592d793
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 523
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f137b684-528d-4c46-b648-4e09c4262385"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-19327c01-1a6f-492a-be7f-3a8bf62b9336

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-19327c01-1a6f-492a-be7f-3a8bf62b9336
Content-Type: application/json

--- response: 204 in 27 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-19327c01-1a6f-492a-be7f-3a8bf62b9336
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
correlation: qa-1f020d6f-4b5a-4f7b-b0f5-6b70924d0775

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f020d6f-4b5a-4f7b-b0f5-6b70924d0775
Content-Type: application/json

--- request body ---
{"handle":"qa-73720a143e76","password":"****"}

--- response: 401 in 15 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1f020d6f-4b5a-4f7b-b0f5-6b70924d0775
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 511
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1f020d6f-4b5a-4f7b-b0f5-6b70924d0775"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-de1dbafe-917b-419d-b157-44ab59df149a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-de1dbafe-917b-419d-b157-44ab59df149a
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-de1dbafe-917b-419d-b157-44ab59df149a
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

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-1ea34e37-4bd8-4f97-a4c0-a472e4ef9169

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1ea34e37-4bd8-4f97-a4c0-a472e4ef9169
Content-Type: application/json

--- request body ---
{"handle":"qa-ac38502eac28","password":"****"}

--- response: 401 in 12 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1ea34e37-4bd8-4f97-a4c0-a472e4ef9169
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 508
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1ea34e37-4bd8-4f97-a4c0-a472e4ef9169"}
```
