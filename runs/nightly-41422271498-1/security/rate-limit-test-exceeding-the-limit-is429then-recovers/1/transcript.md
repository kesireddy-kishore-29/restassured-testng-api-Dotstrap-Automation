# Transcript: Past the limit: 429 with Retry-After, then recovery

| | |
|---|---|
| Test | `com.qaautomation.tests.security.RateLimitTest#exceedingTheLimitIs429ThenRecovers` |
| Features | FEAT-RATE-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 83 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 310 | `qa-19541df3-8e87-46f0-a77c-b4c36ec1c1ca` |
| 2 | `POST /v1/auth/token` | 200 | 44 | `qa-e732383e-c4ec-4fb4-a427-b6d2f0fa44b5` |
| 3 | `GET /v1/accounts/me` | 200 | 34 | `qa-de9ea9d3-3ea5-4464-9560-bd5accb11707` |
| 4 | `GET /v1/accounts/me` | 200 | 15 | `qa-14840366-8493-4e5b-a080-9c4615447c65` |
| 5 | `GET /v1/accounts/me` | 200 | 13 | `qa-bb325319-43b7-427d-872d-fd24344336da` |
| 6 | `GET /v1/accounts/me` | 200 | 15 | `qa-a94c8c54-5c86-4655-b7ee-469238a0cdee` |
| 7 | `GET /v1/accounts/me` | 200 | 7 | `qa-3049ee0b-7c3f-45dc-8dd9-2f6a324cf8ab` |
| 8 | `GET /v1/accounts/me` | 200 | 9 | `qa-a3a8657e-d071-4d44-a2eb-f7bc843d3178` |
| 9 | `GET /v1/accounts/me` | 200 | 6 | `qa-a7c43561-7155-4a4a-8f43-f38764eda479` |
| 10 | `GET /v1/accounts/me` | 200 | 8 | `qa-a28ae0f0-5c23-4339-8734-b1040896b1f9` |
| 11 | `GET /v1/accounts/me` | 200 | 9 | `qa-c515910d-ba93-465b-ac85-6fff4e69fa52` |
| 12 | `GET /v1/accounts/me` | 200 | 8 | `qa-866e2e64-bb26-4a3e-b49d-430ed7a138a0` |
| 13 | `GET /v1/accounts/me` | 200 | 9 | `qa-ee0a0fa5-2435-45bd-8da9-0399e76d8279` |
| 14 | `GET /v1/accounts/me` | 200 | 6 | `qa-6515a6e4-b92f-4975-b94d-4b3fa8db74a9` |
| 15 | `GET /v1/accounts/me` | 200 | 8 | `qa-2a1205ab-f8fe-4a9b-a535-b54befa30011` |
| 16 | `GET /v1/accounts/me` | 200 | 11 | `qa-f59ce213-4697-4e7f-91fa-bd96502d19f4` |
| 17 | `GET /v1/accounts/me` | 200 | 11 | `qa-da0edca9-4f17-47e0-9b45-a6eb36ac84fc` |
| 18 | `GET /v1/accounts/me` | 200 | 11 | `qa-47725476-0ca3-40a5-9585-264f03742f8e` |
| 19 | `GET /v1/accounts/me` | 200 | 11 | `qa-e122a941-0229-4dbc-a4b6-44f89c27990f` |
| 20 | `GET /v1/accounts/me` | 200 | 6 | `qa-25b14608-4c78-4837-80d5-95aeb62aaa98` |
| 21 | `GET /v1/accounts/me` | 200 | 28 | `qa-c0a536fb-7448-4bfd-82c6-bf36e5ca5e1d` |
| 22 | `GET /v1/accounts/me` | 200 | 8 | `qa-479badc4-00fe-428e-9776-e1e0d28b09ca` |
| 23 | `GET /v1/accounts/me` | 200 | 8 | `qa-0115511b-ae94-4b1f-8efb-973137ca1da7` |
| 24 | `GET /v1/accounts/me` | 200 | 8 | `qa-64b43a2d-df29-4cd9-be7e-f71f4f83ab03` |
| 25 | `GET /v1/accounts/me` | 200 | 11 | `qa-cad3f29d-9710-4d5d-b1b8-0ea517a7e632` |
| 26 | `GET /v1/accounts/me` | 200 | 10 | `qa-d8c30777-643f-406a-9df1-d9a2da169c9a` |
| 27 | `GET /v1/accounts/me` | 200 | 7 | `qa-d0bc409c-d13d-49b7-b247-a2b50fea95db` |
| 28 | `GET /v1/accounts/me` | 200 | 6 | `qa-cbb2753f-29b5-4979-85ec-dd85bef249a0` |
| 29 | `GET /v1/accounts/me` | 200 | 5 | `qa-6f1af087-4a2c-4ead-910b-ece8dbb520e2` |
| 30 | `GET /v1/accounts/me` | 200 | 6 | `qa-6408fde6-1e78-44f0-8394-fc306a40c976` |
| 31 | `GET /v1/accounts/me` | 200 | 7 | `qa-83828e5f-ea86-427e-aae1-156e25e35538` |
| 32 | `GET /v1/accounts/me` | 200 | 5 | `qa-a2fd6cd5-4333-4744-ab69-e6e15ef93a7c` |
| 33 | `GET /v1/accounts/me` | 200 | 6 | `qa-52267c2d-6615-40fe-a3e5-3935c6f960f4` |
| 34 | `GET /v1/accounts/me` | 200 | 7 | `qa-8e7516b9-1387-4e92-a50f-b87ad21a9a89` |
| 35 | `GET /v1/accounts/me` | 200 | 6 | `qa-df6c27fb-1e67-4ae1-86c3-27cc0bc9ff89` |
| 36 | `GET /v1/accounts/me` | 200 | 4 | `qa-a1cc8404-5474-446c-a5b8-3109ce3d735a` |
| 37 | `GET /v1/accounts/me` | 200 | 7 | `qa-e1c30710-8dda-46d7-ab07-2d0ca21e047b` |
| 38 | `GET /v1/accounts/me` | 200 | 6 | `qa-d254da6f-ea11-4680-832b-30f12e188b08` |
| 39 | `GET /v1/accounts/me` | 200 | 6 | `qa-b8cbdaef-4aa4-45cc-989e-f1088b1a4758` |
| 40 | `GET /v1/accounts/me` | 200 | 5 | `qa-d7340068-02a9-4452-b02c-c936ac1df0e2` |
| 41 | `GET /v1/accounts/me` | 200 | 7 | `qa-cf14719c-e336-4502-86da-499a698ba51c` |
| 42 | `GET /v1/accounts/me` | 200 | 12 | `qa-bf0724b7-f7c7-49e2-9251-4fc98cc96a7a` |
| 43 | `GET /v1/accounts/me` | 200 | 4 | `qa-4d0a18e8-b35a-4317-b0a9-56f486b49e02` |
| 44 | `GET /v1/accounts/me` | 200 | 4 | `qa-72eceedf-a27c-4690-a9da-6c07ca1c1dbc` |
| 45 | `GET /v1/accounts/me` | 200 | 5 | `qa-f770bfe3-5c82-4b13-8b23-fe97adf08c99` |
| 46 | `GET /v1/accounts/me` | 200 | 5 | `qa-bb43ef16-bebc-4b8d-b289-929e1d8e3479` |
| 47 | `GET /v1/accounts/me` | 200 | 6 | `qa-e0d4176b-411d-4356-9f24-cb79295f1a4f` |
| 48 | `GET /v1/accounts/me` | 200 | 5 | `qa-64490a39-1df9-4928-ac73-1168d2d81cd4` |
| 49 | `GET /v1/accounts/me` | 200 | 5 | `qa-a67ce49e-652d-4f73-9456-8035c25acfe3` |
| 50 | `GET /v1/accounts/me` | 200 | 7 | `qa-ff3037cf-0012-4605-83fd-b0020b88fb2a` |
| 51 | `GET /v1/accounts/me` | 200 | 11 | `qa-d1299efd-148e-401e-86aa-652991cfd84a` |
| 52 | `GET /v1/accounts/me` | 200 | 12 | `qa-097089a1-f9f0-4606-834c-6ce7cab149d5` |
| 53 | `GET /v1/accounts/me` | 200 | 14 | `qa-35ddc9b2-75b8-4fb8-9e5e-dbbdf6bdd485` |
| 54 | `GET /v1/accounts/me` | 200 | 11 | `qa-308188b5-ccde-4c67-a1dc-b21aa4cd37f8` |
| 55 | `GET /v1/accounts/me` | 200 | 9 | `qa-ccb96301-8402-4621-813d-bcefd3f07aba` |
| 56 | `GET /v1/accounts/me` | 200 | 8 | `qa-0995161a-3f47-440d-a43e-95c6fbc12aa9` |
| 57 | `GET /v1/accounts/me` | 200 | 9 | `qa-ebb83558-5c9e-4484-b960-ccc73f85d4d8` |
| 58 | `GET /v1/accounts/me` | 200 | 10 | `qa-2e71589b-d0a2-464f-b6f9-40cf851c5593` |
| 59 | `GET /v1/accounts/me` | 200 | 5 | `qa-4282b9cf-904f-4bf9-9cb8-02a64cf765c8` |
| 60 | `GET /v1/accounts/me` | 200 | 10 | `qa-8a0b3e14-eedc-4ebb-89aa-24cc4c43d34a` |
| 61 | `GET /v1/accounts/me` | 200 | 17 | `qa-1e21c29d-5c60-4ba3-9c82-7f4cdc7e2101` |
| 62 | `GET /v1/accounts/me` | 200 | 6 | `qa-801aee2e-58b0-4666-94a0-545e86d29f7a` |
| 63 | `GET /v1/accounts/me` | 429 | 4 | `qa-32a93f22-1667-4b1c-a31a-3716f13d0dd5` |
| 64 | `GET /v1/accounts/me` | 429 | 5 | `qa-30cc6e9b-9dd7-4f31-ab2e-92c0774151f6` |
| 65 | `GET /v1/accounts/me` | 429 | 7 | `qa-61807f15-c832-4751-87b8-68627dac829a` |
| 66 | `GET /v1/accounts/me` | 429 | 4 | `qa-1997e111-a303-4b91-884a-e8e30740c16d` |
| 67 | `GET /v1/accounts/me` | 429 | 4 | `qa-ae28ee6a-6fc7-439f-9736-f167869e3b7f` |
| 68 | `GET /v1/accounts/me` | 429 | 3 | `qa-4ef71e7b-1d47-465f-972d-0dce33c40858` |
| 69 | `GET /v1/accounts/me` | 429 | 4 | `qa-574c3c9c-282c-4cf7-86a1-95f8028cff05` |
| 70 | `GET /v1/accounts/me` | 429 | 4 | `qa-811210e7-98ec-43f7-83bb-20d51876f803` |
| 71 | `GET /v1/accounts/me` | 429 | 4 | `qa-49086c98-4317-4a73-b01f-984b9dd7fa49` |
| 72 | `GET /v1/accounts/me` | 429 | 4 | `qa-3724a94b-7260-47f4-a387-f2be06964600` |
| 73 | `GET /v1/accounts/me` | 429 | 5 | `qa-057b8a96-917b-4634-b07b-c70db635bc36` |
| 74 | `GET /v1/accounts/me` | 429 | 4 | `qa-5aa0aa3c-a840-49ee-a2e4-aed83e177ac0` |
| 75 | `GET /v1/accounts/me` | 429 | 5 | `qa-c7e322e0-6765-40d3-9668-917c4f9aed89` |
| 76 | `GET /v1/accounts/me` | 429 | 3 | `qa-8edd25d7-b9be-45ce-b880-5ff2d43f831a` |
| 77 | `GET /v1/accounts/me` | 429 | 4 | `qa-18e64f63-7f14-4cfe-a031-a30677b669e1` |
| 78 | `GET /v1/accounts/me` | 429 | 4 | `qa-f6853530-9ba9-495d-b88a-991920ad3ebd` |
| 79 | `GET /v1/accounts/me` | 429 | 4 | `qa-cf22a848-f43f-4b4f-8af0-09a2b417c98e` |
| 80 | `GET /v1/accounts/me` | 429 | 3 | `qa-876a7f1a-2a25-4ca5-b0ed-2fd5f623cf69` |
| 81 | `GET /v1/accounts/me` | 200 | 4 | `qa-ad559c1d-9d91-4032-bbc8-d44ea0f4e5af` |
| 82 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-6d869e83-da64-4518-bda7-3beb6d42b747` |
| 83 | `POST /v1/auth/token` | 401 | 5 | `qa-64a1adea-319b-4f5f-8ae7-5d41f14f331e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-19541df3-8e87-46f0-a77c-b4c36ec1c1ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-19541df3-8e87-46f0-a77c-b4c36ec1c1ca
Content-Type: application/json

--- request body ---
{"handle":"qa-2cd6c394b62a","displayName":"QA 2cd6c394b62a","password":"****","region":"eu"}

--- response: 201 in 310 ms ---
Date: Mon, 02 Nov 2026 09:38:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-19541df3-8e87-46f0-a77c-b4c36ec1c1ca
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
Location: /v1/accounts/qa-2cd6c394b62a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3f9f5c7f-9bad-4c40-8382-8f2d4f26dea6","handle":"qa-2cd6c394b62a","displayName":"QA 2cd6c394b62a","region":"eu","role":"user","createdAt":"2026-11-02T09:38:41.803458086Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-e732383e-c4ec-4fb4-a427-b6d2f0fa44b5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e732383e-c4ec-4fb4-a427-b6d2f0fa44b5
Content-Type: application/json

--- request body ---
{"handle":"qa-2cd6c394b62a","password":"****"}

--- response: 200 in 44 ms ---
Date: Mon, 02 Nov 2026 09:38:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-e732383e-c4ec-4fb4-a427-b6d2f0fa44b5
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3f9f5c7f-9bad-4c40-8382-8f2d4f26dea6"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-de9ea9d3-3ea5-4464-9560-bd5accb11707

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-de9ea9d3-3ea5-4464-9560-bd5accb11707
Content-Type: application/json

--- response: 200 in 34 ms ---
Date: Mon, 02 Nov 2026 09:38:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-de9ea9d3-3ea5-4464-9560-bd5accb11707
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
Content-Length: 181

{"id":"acc_3f9f5c7f-9bad-4c40-8382-8f2d4f26dea6","handle":"qa-2cd6c394b62a","displayName":"QA 2cd6c394b62a","region":"eu","role":"user","createdAt":"2026-11-02T09:38:41.803458086Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-14840366-8493-4e5b-a080-9c4615447c65

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-14840366-8493-4e5b-a080-9c4615447c65
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Mon, 02 Nov 2026 09:38:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-14840366-8493-4e5b-a080-9c4615447c65
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
Content-Length: 181

{"id":"acc_3f9f5c7f-9bad-4c40-8382-8f2d4f26dea6","handle":"qa-2cd6c394b62a","displayName":"QA 2cd6c394b62a","region":"eu","role":"user","createdAt":"2026-11-02T09:38:41.803458086Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-bb325319-43b7-427d-872d-fd24344336da

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb325319-43b7-427d-872d-fd24344336da
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Mon, 02 Nov 2026 09:38:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-bb325319-43b7-427d-872d-fd24344336da
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
Content-Length: 181

{"id":"acc_3f9f5c7f-9bad-4c40-8382-8f2d4f26dea6","handle":"qa-2cd6c394b62a","displayName":"QA 2cd6c394b62a","region":"eu","role":"user","createdAt":"2026-11-02T09:38:41.803458086Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-a94c8c54-5c86-4655-b7ee-469238a0cdee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a94c8c54-5c86-4655-b7ee-469238a0cdee
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Mon, 02 Nov 2026 09:38:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-a94c8c54-5c86-4655-b7ee-469238a0cdee
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
Content-Length: 181

{"id":"acc_3f9f5c7f-9bad-4c40-8382-8f2d4f26dea6","handle":"qa-2cd6c394b62a","displayName":"QA 2cd6c394b62a","region":"eu","role":"user","createdAt":"2026-11-02T09:38:41.803458086Z"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-3049ee0b-7c3f-45dc-8dd9-2f6a324cf8ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3049ee0b-7c3f-45dc-8dd9-2f6a324cf8ab
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Mon, 02 Nov 2026 09:38:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-3049ee0b-7c3f-45dc-8dd9-2f6a324cf8ab
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
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3f9f5c7f-9bad-4c40-8382-8f2d4f26dea6","handle":"qa-2cd6c394b62a","displayName":"QA 2cd6c394b62a","region":"eu","role":"user","createdAt":"2026-11-02T09:38:41.803458086Z"}
```

## 8. GET /v1/accounts/me

```text
#8 GET http://localhost:7070/v1/accounts/me
correlation: qa-a3a8657e-d071-4d44-a2eb-f7bc843d3178

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a3a8657e-d071-4d44-a2eb-f7bc843d3178
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Mon, 02 Nov 2026 09:38:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-a3a8657e-d071-4d44-a2eb-f7bc843d3178
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
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3f9f5c7f-9bad-4c40-8382-8f2d4f26dea6","handle":"qa-2cd6c394b62a","displayName":"QA 2cd6c394b62a","region":"eu","role":"user","createdAt":"2026-11-02T09:38:41.803458086Z"}
```

## 9. GET /v1/accounts/me

```text
#9 GET http://localhost:7070/v1/accounts/me
correlation: qa-a7c43561-7155-4a4a-8f43-f38764eda479

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a7c43561-7155-4a4a-8f43-f38764eda479
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Mon, 02 Nov 2026 09:38:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-a7c43561-7155-4a4a-8f43-f38764eda479
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
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3f9f5c7f-9bad-4c40-8382-8f2d4f26dea6","handle":"qa-2cd6c394b62a","displayName":"QA 2cd6c394b62a","region":"eu","role":"user","createdAt":"2026-11-02T09:38:41.803458086Z"}
```

## 10. GET /v1/accounts/me

```text
#10 GET http://localhost:7070/v1/accounts/me
correlation: qa-a28ae0f0-5c23-4339-8734-b1040896b1f9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a28ae0f0-5c23-4339-8734-b1040896b1f9
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Mon, 02 Nov 2026 09:38:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-a28ae0f0-5c23-4339-8734-b1040896b1f9
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
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3f9f5c7f-9bad-4c40-8382-8f2d4f26dea6","handle":"qa-2cd6c394b62a","displayName":"QA 2cd6c394b62a","region":"eu","role":"user","createdAt":"2026-11-02T09:38:41.803458086Z"}
```

## 11. GET /v1/accounts/me

```text
#11 GET http://localhost:7070/v1/accounts/me
correlation: qa-c515910d-ba93-465b-ac85-6fff4e69fa52

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c515910d-ba93-465b-ac85-6fff4e69fa52
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Mon, 02 Nov 2026 09:38:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-c515910d-ba93-465b-ac85-6fff4e69fa52
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
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3f9f5c7f-9bad-4c40-8382-8f2d4f26dea6","handle":"qa-2cd6c394b62a","displayName":"QA 2cd6c394b62a","region":"eu","role":"user","createdAt":"2026-11-02T09:38:41.803458086Z"}
```

## 12. GET /v1/accounts/me

```text
#12 GET http://localhost:7070/v1/accounts/me
correlation: qa-866e2e64-bb26-4a3e-b49d-430ed7a138a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-866e2e64-bb26-4a3e-b49d-430ed7a138a0
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Mon, 02 Nov 2026 09:38:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-866e2e64-bb26-4a3e-b49d-430ed7a138a0
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
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3f9f5c7f-9bad-4c40-8382-8f2d4f26dea6","handle":"qa-2cd6c394b62a","displayName":"QA 2cd6c394b62a","region":"eu","role":"user","createdAt":"2026-11-02T09:38:41.803458086Z"}
```

## 13. GET /v1/accounts/me

```text
#13 GET http://localhost:7070/v1/accounts/me
correlation: qa-ee0a0fa5-2435-45bd-8da9-0399e76d8279

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee0a0fa5-2435-45bd-8da9-0399e76d8279
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Mon, 02 Nov 2026 09:38:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-ee0a0fa5-2435-45bd-8da9-0399e76d8279
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
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3f9f5c7f-9bad-4c40-8382-8f2d4f26dea6","handle":"qa-2cd6c394b62a","displayName":"QA 2cd6c394b62a","region":"eu","role":"user","createdAt":"2026-11-02T09:38:41.803458086Z"}
```

## 14. GET /v1/accounts/me

```text
#14 GET http://localhost:7070/v1/accounts/me
correlation: qa-6515a6e4-b92f-4975-b94d-4b3fa8db74a9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6515a6e4-b92f-4975-b94d-4b3fa8db74a9
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Mon, 02 Nov 2026 09:38:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-6515a6e4-b92f-4975-b94d-4b3fa8db74a9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 48
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3f9f5c7f-9bad-4c40-8382-8f2d4f26dea6","handle":"qa-2cd6c394b62a","displayName":"QA 2cd6c394b62a","region":"eu","role":"user","createdAt":"2026-11-02T09:38:41.803458086Z"}
```

## 15. GET /v1/accounts/me

```text
#15 GET http://localhost:7070/v1/accounts/me
correlation: qa-2a1205ab-f8fe-4a9b-a535-b54befa30011

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2a1205ab-f8fe-4a9b-a535-b54befa30011
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Mon, 02 Nov 2026 09:38:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-2a1205ab-f8fe-4a9b-a535-b54befa30011
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 47
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3f9f5c7f-9bad-4c40-8382-8f2d4f26dea6","handle":"qa-2cd6c394b62a","displayName":"QA 2cd6c394b62a","region":"eu","role":"user","createdAt":"2026-11-02T09:38:41.803458086Z"}
```

## 16. GET /v1/accounts/me

```text
#16 GET http://localhost:7070/v1/accounts/me
correlation: qa-f59ce213-4697-4e7f-91fa-bd96502d19f4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f59ce213-4697-4e7f-91fa-bd96502d19f4
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Mon, 02 Nov 2026 09:38:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-f59ce213-4697-4e7f-91fa-bd96502d19f4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 46
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3f9f5c7f-9bad-4c40-8382-8f2d4f26dea6","handle":"qa-2cd6c394b62a","displayName":"QA 2cd6c394b62a","region":"eu","role":"user","createdAt":"2026-11-02T09:38:41.803458086Z"}
```

## 17. GET /v1/accounts/me

```text
#17 GET http://localhost:7070/v1/accounts/me
correlation: qa-da0edca9-4f17-47e0-9b45-a6eb36ac84fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-da0edca9-4f17-47e0-9b45-a6eb36ac84fc
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Mon, 02 Nov 2026 09:38:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-da0edca9-4f17-47e0-9b45-a6eb36ac84fc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 45
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3f9f5c7f-9bad-4c40-8382-8f2d4f26dea6","handle":"qa-2cd6c394b62a","displayName":"QA 2cd6c394b62a","region":"eu","role":"user","createdAt":"2026-11-02T09:38:41.803458086Z"}
```

## 18. GET /v1/accounts/me

```text
#18 GET http://localhost:7070/v1/accounts/me
correlation: qa-47725476-0ca3-40a5-9585-264f03742f8e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-47725476-0ca3-40a5-9585-264f03742f8e
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Mon, 02 Nov 2026 09:38:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-47725476-0ca3-40a5-9585-264f03742f8e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 44
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3f9f5c7f-9bad-4c40-8382-8f2d4f26dea6","handle":"qa-2cd6c394b62a","displayName":"QA 2cd6c394b62a","region":"eu","role":"user","createdAt":"2026-11-02T09:38:41.803458086Z"}
```

## 19. GET /v1/accounts/me

```text
#19 GET http://localhost:7070/v1/accounts/me
correlation: qa-e122a941-0229-4dbc-a4b6-44f89c27990f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e122a941-0229-4dbc-a4b6-44f89c27990f
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Mon, 02 Nov 2026 09:38:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-e122a941-0229-4dbc-a4b6-44f89c27990f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 43
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3f9f5c7f-9bad-4c40-8382-8f2d4f26dea6","handle":"qa-2cd6c394b62a","displayName":"QA 2cd6c394b62a","region":"eu","role":"user","createdAt":"2026-11-02T09:38:41.803458086Z"}
```

## 20. GET /v1/accounts/me

```text
#20 GET http://localhost:7070/v1/accounts/me
correlation: qa-25b14608-4c78-4837-80d5-95aeb62aaa98

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-25b14608-4c78-4837-80d5-95aeb62aaa98
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Mon, 02 Nov 2026 09:38:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-25b14608-4c78-4837-80d5-95aeb62aaa98
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 42
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3f9f5c7f-9bad-4c40-8382-8f2d4f26dea6","handle":"qa-2cd6c394b62a","displayName":"QA 2cd6c394b62a","region":"eu","role":"user","createdAt":"2026-11-02T09:38:41.803458086Z"}
```

## 21. GET /v1/accounts/me

```text
#21 GET http://localhost:7070/v1/accounts/me
correlation: qa-c0a536fb-7448-4bfd-82c6-bf36e5ca5e1d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c0a536fb-7448-4bfd-82c6-bf36e5ca5e1d
Content-Type: application/json

--- response: 200 in 28 ms ---
Date: Mon, 02 Nov 2026 09:38:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-c0a536fb-7448-4bfd-82c6-bf36e5ca5e1d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 41
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3f9f5c7f-9bad-4c40-8382-8f2d4f26dea6","handle":"qa-2cd6c394b62a","displayName":"QA 2cd6c394b62a","region":"eu","role":"user","createdAt":"2026-11-02T09:38:41.803458086Z"}
```

## 22. GET /v1/accounts/me

```text
#22 GET http://localhost:7070/v1/accounts/me
correlation: qa-479badc4-00fe-428e-9776-e1e0d28b09ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-479badc4-00fe-428e-9776-e1e0d28b09ca
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Mon, 02 Nov 2026 09:38:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-479badc4-00fe-428e-9776-e1e0d28b09ca
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 40
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3f9f5c7f-9bad-4c40-8382-8f2d4f26dea6","handle":"qa-2cd6c394b62a","displayName":"QA 2cd6c394b62a","region":"eu","role":"user","createdAt":"2026-11-02T09:38:41.803458086Z"}
```

## 23. GET /v1/accounts/me

```text
#23 GET http://localhost:7070/v1/accounts/me
correlation: qa-0115511b-ae94-4b1f-8efb-973137ca1da7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0115511b-ae94-4b1f-8efb-973137ca1da7
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Mon, 02 Nov 2026 09:38:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-0115511b-ae94-4b1f-8efb-973137ca1da7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 39
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3f9f5c7f-9bad-4c40-8382-8f2d4f26dea6","handle":"qa-2cd6c394b62a","displayName":"QA 2cd6c394b62a","region":"eu","role":"user","createdAt":"2026-11-02T09:38:41.803458086Z"}
```

## 24. GET /v1/accounts/me

```text
#24 GET http://localhost:7070/v1/accounts/me
correlation: qa-64b43a2d-df29-4cd9-be7e-f71f4f83ab03

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-64b43a2d-df29-4cd9-be7e-f71f4f83ab03
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Mon, 02 Nov 2026 09:38:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-64b43a2d-df29-4cd9-be7e-f71f4f83ab03
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 38
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3f9f5c7f-9bad-4c40-8382-8f2d4f26dea6","handle":"qa-2cd6c394b62a","displayName":"QA 2cd6c394b62a","region":"eu","role":"user","createdAt":"2026-11-02T09:38:41.803458086Z"}
```

## 25. GET /v1/accounts/me

```text
#25 GET http://localhost:7070/v1/accounts/me
correlation: qa-cad3f29d-9710-4d5d-b1b8-0ea517a7e632

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cad3f29d-9710-4d5d-b1b8-0ea517a7e632
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Mon, 02 Nov 2026 09:38:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-cad3f29d-9710-4d5d-b1b8-0ea517a7e632
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 37
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3f9f5c7f-9bad-4c40-8382-8f2d4f26dea6","handle":"qa-2cd6c394b62a","displayName":"QA 2cd6c394b62a","region":"eu","role":"user","createdAt":"2026-11-02T09:38:41.803458086Z"}
```

## 26. GET /v1/accounts/me

```text
#26 GET http://localhost:7070/v1/accounts/me
correlation: qa-d8c30777-643f-406a-9df1-d9a2da169c9a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d8c30777-643f-406a-9df1-d9a2da169c9a
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Mon, 02 Nov 2026 09:38:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-d8c30777-643f-406a-9df1-d9a2da169c9a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 36
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3f9f5c7f-9bad-4c40-8382-8f2d4f26dea6","handle":"qa-2cd6c394b62a","displayName":"QA 2cd6c394b62a","region":"eu","role":"user","createdAt":"2026-11-02T09:38:41.803458086Z"}
```

## 27. GET /v1/accounts/me

```text
#27 GET http://localhost:7070/v1/accounts/me
correlation: qa-d0bc409c-d13d-49b7-b247-a2b50fea95db

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0bc409c-d13d-49b7-b247-a2b50fea95db
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Mon, 02 Nov 2026 09:38:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-d0bc409c-d13d-49b7-b247-a2b50fea95db
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 35
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3f9f5c7f-9bad-4c40-8382-8f2d4f26dea6","handle":"qa-2cd6c394b62a","displayName":"QA 2cd6c394b62a","region":"eu","role":"user","createdAt":"2026-11-02T09:38:41.803458086Z"}
```

## 28. GET /v1/accounts/me

```text
#28 GET http://localhost:7070/v1/accounts/me
correlation: qa-cbb2753f-29b5-4979-85ec-dd85bef249a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cbb2753f-29b5-4979-85ec-dd85bef249a0
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Mon, 02 Nov 2026 09:38:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-cbb2753f-29b5-4979-85ec-dd85bef249a0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 34
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3f9f5c7f-9bad-4c40-8382-8f2d4f26dea6","handle":"qa-2cd6c394b62a","displayName":"QA 2cd6c394b62a","region":"eu","role":"user","createdAt":"2026-11-02T09:38:41.803458086Z"}
```

## 29. GET /v1/accounts/me

```text
#29 GET http://localhost:7070/v1/accounts/me
correlation: qa-6f1af087-4a2c-4ead-910b-ece8dbb520e2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f1af087-4a2c-4ead-910b-ece8dbb520e2
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Mon, 02 Nov 2026 09:38:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-6f1af087-4a2c-4ead-910b-ece8dbb520e2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 33
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3f9f5c7f-9bad-4c40-8382-8f2d4f26dea6","handle":"qa-2cd6c394b62a","displayName":"QA 2cd6c394b62a","region":"eu","role":"user","createdAt":"2026-11-02T09:38:41.803458086Z"}
```

## 30. GET /v1/accounts/me

```text
#30 GET http://localhost:7070/v1/accounts/me
correlation: qa-6408fde6-1e78-44f0-8394-fc306a40c976

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6408fde6-1e78-44f0-8394-fc306a40c976
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Mon, 02 Nov 2026 09:38:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-6408fde6-1e78-44f0-8394-fc306a40c976
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 32
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3f9f5c7f-9bad-4c40-8382-8f2d4f26dea6","handle":"qa-2cd6c394b62a","displayName":"QA 2cd6c394b62a","region":"eu","role":"user","createdAt":"2026-11-02T09:38:41.803458086Z"}
```

## 31. GET /v1/accounts/me

```text
#31 GET http://localhost:7070/v1/accounts/me
correlation: qa-83828e5f-ea86-427e-aae1-156e25e35538

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-83828e5f-ea86-427e-aae1-156e25e35538
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Mon, 02 Nov 2026 09:38:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-83828e5f-ea86-427e-aae1-156e25e35538
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 31
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3f9f5c7f-9bad-4c40-8382-8f2d4f26dea6","handle":"qa-2cd6c394b62a","displayName":"QA 2cd6c394b62a","region":"eu","role":"user","createdAt":"2026-11-02T09:38:41.803458086Z"}
```

## 32. GET /v1/accounts/me

```text
#32 GET http://localhost:7070/v1/accounts/me
correlation: qa-a2fd6cd5-4333-4744-ab69-e6e15ef93a7c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a2fd6cd5-4333-4744-ab69-e6e15ef93a7c
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Mon, 02 Nov 2026 09:38:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-a2fd6cd5-4333-4744-ab69-e6e15ef93a7c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 30
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3f9f5c7f-9bad-4c40-8382-8f2d4f26dea6","handle":"qa-2cd6c394b62a","displayName":"QA 2cd6c394b62a","region":"eu","role":"user","createdAt":"2026-11-02T09:38:41.803458086Z"}
```

## 33. GET /v1/accounts/me

```text
#33 GET http://localhost:7070/v1/accounts/me
correlation: qa-52267c2d-6615-40fe-a3e5-3935c6f960f4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-52267c2d-6615-40fe-a3e5-3935c6f960f4
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Mon, 02 Nov 2026 09:38:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-52267c2d-6615-40fe-a3e5-3935c6f960f4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 29
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3f9f5c7f-9bad-4c40-8382-8f2d4f26dea6","handle":"qa-2cd6c394b62a","displayName":"QA 2cd6c394b62a","region":"eu","role":"user","createdAt":"2026-11-02T09:38:41.803458086Z"}
```

## 34. GET /v1/accounts/me

```text
#34 GET http://localhost:7070/v1/accounts/me
correlation: qa-8e7516b9-1387-4e92-a50f-b87ad21a9a89

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e7516b9-1387-4e92-a50f-b87ad21a9a89
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Mon, 02 Nov 2026 09:38:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-8e7516b9-1387-4e92-a50f-b87ad21a9a89
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 28
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3f9f5c7f-9bad-4c40-8382-8f2d4f26dea6","handle":"qa-2cd6c394b62a","displayName":"QA 2cd6c394b62a","region":"eu","role":"user","createdAt":"2026-11-02T09:38:41.803458086Z"}
```

## 35. GET /v1/accounts/me

```text
#35 GET http://localhost:7070/v1/accounts/me
correlation: qa-df6c27fb-1e67-4ae1-86c3-27cc0bc9ff89

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df6c27fb-1e67-4ae1-86c3-27cc0bc9ff89
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Mon, 02 Nov 2026 09:38:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-df6c27fb-1e67-4ae1-86c3-27cc0bc9ff89
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 27
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3f9f5c7f-9bad-4c40-8382-8f2d4f26dea6","handle":"qa-2cd6c394b62a","displayName":"QA 2cd6c394b62a","region":"eu","role":"user","createdAt":"2026-11-02T09:38:41.803458086Z"}
```

## 36. GET /v1/accounts/me

```text
#36 GET http://localhost:7070/v1/accounts/me
correlation: qa-a1cc8404-5474-446c-a5b8-3109ce3d735a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a1cc8404-5474-446c-a5b8-3109ce3d735a
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Mon, 02 Nov 2026 09:38:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-a1cc8404-5474-446c-a5b8-3109ce3d735a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 26
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3f9f5c7f-9bad-4c40-8382-8f2d4f26dea6","handle":"qa-2cd6c394b62a","displayName":"QA 2cd6c394b62a","region":"eu","role":"user","createdAt":"2026-11-02T09:38:41.803458086Z"}
```

## 37. GET /v1/accounts/me

```text
#37 GET http://localhost:7070/v1/accounts/me
correlation: qa-e1c30710-8dda-46d7-ab07-2d0ca21e047b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e1c30710-8dda-46d7-ab07-2d0ca21e047b
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Mon, 02 Nov 2026 09:38:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-e1c30710-8dda-46d7-ab07-2d0ca21e047b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 25
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3f9f5c7f-9bad-4c40-8382-8f2d4f26dea6","handle":"qa-2cd6c394b62a","displayName":"QA 2cd6c394b62a","region":"eu","role":"user","createdAt":"2026-11-02T09:38:41.803458086Z"}
```

## 38. GET /v1/accounts/me

```text
#38 GET http://localhost:7070/v1/accounts/me
correlation: qa-d254da6f-ea11-4680-832b-30f12e188b08

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d254da6f-ea11-4680-832b-30f12e188b08
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Mon, 02 Nov 2026 09:38:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-d254da6f-ea11-4680-832b-30f12e188b08
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 24
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3f9f5c7f-9bad-4c40-8382-8f2d4f26dea6","handle":"qa-2cd6c394b62a","displayName":"QA 2cd6c394b62a","region":"eu","role":"user","createdAt":"2026-11-02T09:38:41.803458086Z"}
```

## 39. GET /v1/accounts/me

```text
#39 GET http://localhost:7070/v1/accounts/me
correlation: qa-b8cbdaef-4aa4-45cc-989e-f1088b1a4758

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b8cbdaef-4aa4-45cc-989e-f1088b1a4758
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Mon, 02 Nov 2026 09:38:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-b8cbdaef-4aa4-45cc-989e-f1088b1a4758
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 23
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3f9f5c7f-9bad-4c40-8382-8f2d4f26dea6","handle":"qa-2cd6c394b62a","displayName":"QA 2cd6c394b62a","region":"eu","role":"user","createdAt":"2026-11-02T09:38:41.803458086Z"}
```

## 40. GET /v1/accounts/me

```text
#40 GET http://localhost:7070/v1/accounts/me
correlation: qa-d7340068-02a9-4452-b02c-c936ac1df0e2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d7340068-02a9-4452-b02c-c936ac1df0e2
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Mon, 02 Nov 2026 09:38:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-d7340068-02a9-4452-b02c-c936ac1df0e2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 22
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3f9f5c7f-9bad-4c40-8382-8f2d4f26dea6","handle":"qa-2cd6c394b62a","displayName":"QA 2cd6c394b62a","region":"eu","role":"user","createdAt":"2026-11-02T09:38:41.803458086Z"}
```

## 41. GET /v1/accounts/me

```text
#41 GET http://localhost:7070/v1/accounts/me
correlation: qa-cf14719c-e336-4502-86da-499a698ba51c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cf14719c-e336-4502-86da-499a698ba51c
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Mon, 02 Nov 2026 09:38:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-cf14719c-e336-4502-86da-499a698ba51c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 21
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3f9f5c7f-9bad-4c40-8382-8f2d4f26dea6","handle":"qa-2cd6c394b62a","displayName":"QA 2cd6c394b62a","region":"eu","role":"user","createdAt":"2026-11-02T09:38:41.803458086Z"}
```

## 42. GET /v1/accounts/me

```text
#42 GET http://localhost:7070/v1/accounts/me
correlation: qa-bf0724b7-f7c7-49e2-9251-4fc98cc96a7a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf0724b7-f7c7-49e2-9251-4fc98cc96a7a
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Mon, 02 Nov 2026 09:38:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-bf0724b7-f7c7-49e2-9251-4fc98cc96a7a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 20
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3f9f5c7f-9bad-4c40-8382-8f2d4f26dea6","handle":"qa-2cd6c394b62a","displayName":"QA 2cd6c394b62a","region":"eu","role":"user","createdAt":"2026-11-02T09:38:41.803458086Z"}
```

## 43. GET /v1/accounts/me

```text
#43 GET http://localhost:7070/v1/accounts/me
correlation: qa-4d0a18e8-b35a-4317-b0a9-56f486b49e02

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4d0a18e8-b35a-4317-b0a9-56f486b49e02
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Mon, 02 Nov 2026 09:38:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-4d0a18e8-b35a-4317-b0a9-56f486b49e02
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 19
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3f9f5c7f-9bad-4c40-8382-8f2d4f26dea6","handle":"qa-2cd6c394b62a","displayName":"QA 2cd6c394b62a","region":"eu","role":"user","createdAt":"2026-11-02T09:38:41.803458086Z"}
```

## 44. GET /v1/accounts/me

```text
#44 GET http://localhost:7070/v1/accounts/me
correlation: qa-72eceedf-a27c-4690-a9da-6c07ca1c1dbc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-72eceedf-a27c-4690-a9da-6c07ca1c1dbc
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Mon, 02 Nov 2026 09:38:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-72eceedf-a27c-4690-a9da-6c07ca1c1dbc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 18
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3f9f5c7f-9bad-4c40-8382-8f2d4f26dea6","handle":"qa-2cd6c394b62a","displayName":"QA 2cd6c394b62a","region":"eu","role":"user","createdAt":"2026-11-02T09:38:41.803458086Z"}
```

## 45. GET /v1/accounts/me

```text
#45 GET http://localhost:7070/v1/accounts/me
correlation: qa-f770bfe3-5c82-4b13-8b23-fe97adf08c99

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f770bfe3-5c82-4b13-8b23-fe97adf08c99
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Mon, 02 Nov 2026 09:38:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-f770bfe3-5c82-4b13-8b23-fe97adf08c99
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 17
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3f9f5c7f-9bad-4c40-8382-8f2d4f26dea6","handle":"qa-2cd6c394b62a","displayName":"QA 2cd6c394b62a","region":"eu","role":"user","createdAt":"2026-11-02T09:38:41.803458086Z"}
```

## 46. GET /v1/accounts/me

```text
#46 GET http://localhost:7070/v1/accounts/me
correlation: qa-bb43ef16-bebc-4b8d-b289-929e1d8e3479

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb43ef16-bebc-4b8d-b289-929e1d8e3479
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Mon, 02 Nov 2026 09:38:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-bb43ef16-bebc-4b8d-b289-929e1d8e3479
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 16
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3f9f5c7f-9bad-4c40-8382-8f2d4f26dea6","handle":"qa-2cd6c394b62a","displayName":"QA 2cd6c394b62a","region":"eu","role":"user","createdAt":"2026-11-02T09:38:41.803458086Z"}
```

## 47. GET /v1/accounts/me

```text
#47 GET http://localhost:7070/v1/accounts/me
correlation: qa-e0d4176b-411d-4356-9f24-cb79295f1a4f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e0d4176b-411d-4356-9f24-cb79295f1a4f
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Mon, 02 Nov 2026 09:38:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-e0d4176b-411d-4356-9f24-cb79295f1a4f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 15
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3f9f5c7f-9bad-4c40-8382-8f2d4f26dea6","handle":"qa-2cd6c394b62a","displayName":"QA 2cd6c394b62a","region":"eu","role":"user","createdAt":"2026-11-02T09:38:41.803458086Z"}
```

## 48. GET /v1/accounts/me

```text
#48 GET http://localhost:7070/v1/accounts/me
correlation: qa-64490a39-1df9-4928-ac73-1168d2d81cd4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-64490a39-1df9-4928-ac73-1168d2d81cd4
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Mon, 02 Nov 2026 09:38:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-64490a39-1df9-4928-ac73-1168d2d81cd4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 14
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3f9f5c7f-9bad-4c40-8382-8f2d4f26dea6","handle":"qa-2cd6c394b62a","displayName":"QA 2cd6c394b62a","region":"eu","role":"user","createdAt":"2026-11-02T09:38:41.803458086Z"}
```

## 49. GET /v1/accounts/me

```text
#49 GET http://localhost:7070/v1/accounts/me
correlation: qa-a67ce49e-652d-4f73-9456-8035c25acfe3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a67ce49e-652d-4f73-9456-8035c25acfe3
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Mon, 02 Nov 2026 09:38:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-a67ce49e-652d-4f73-9456-8035c25acfe3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 13
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3f9f5c7f-9bad-4c40-8382-8f2d4f26dea6","handle":"qa-2cd6c394b62a","displayName":"QA 2cd6c394b62a","region":"eu","role":"user","createdAt":"2026-11-02T09:38:41.803458086Z"}
```

## 50. GET /v1/accounts/me

```text
#50 GET http://localhost:7070/v1/accounts/me
correlation: qa-ff3037cf-0012-4605-83fd-b0020b88fb2a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff3037cf-0012-4605-83fd-b0020b88fb2a
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Mon, 02 Nov 2026 09:38:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-ff3037cf-0012-4605-83fd-b0020b88fb2a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 12
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3f9f5c7f-9bad-4c40-8382-8f2d4f26dea6","handle":"qa-2cd6c394b62a","displayName":"QA 2cd6c394b62a","region":"eu","role":"user","createdAt":"2026-11-02T09:38:41.803458086Z"}
```

## 51. GET /v1/accounts/me

```text
#51 GET http://localhost:7070/v1/accounts/me
correlation: qa-d1299efd-148e-401e-86aa-652991cfd84a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d1299efd-148e-401e-86aa-652991cfd84a
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Mon, 02 Nov 2026 09:38:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-d1299efd-148e-401e-86aa-652991cfd84a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 11
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3f9f5c7f-9bad-4c40-8382-8f2d4f26dea6","handle":"qa-2cd6c394b62a","displayName":"QA 2cd6c394b62a","region":"eu","role":"user","createdAt":"2026-11-02T09:38:41.803458086Z"}
```

## 52. GET /v1/accounts/me

```text
#52 GET http://localhost:7070/v1/accounts/me
correlation: qa-097089a1-f9f0-4606-834c-6ce7cab149d5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-097089a1-f9f0-4606-834c-6ce7cab149d5
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Mon, 02 Nov 2026 09:38:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-097089a1-f9f0-4606-834c-6ce7cab149d5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 10
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3f9f5c7f-9bad-4c40-8382-8f2d4f26dea6","handle":"qa-2cd6c394b62a","displayName":"QA 2cd6c394b62a","region":"eu","role":"user","createdAt":"2026-11-02T09:38:41.803458086Z"}
```

## 53. GET /v1/accounts/me

```text
#53 GET http://localhost:7070/v1/accounts/me
correlation: qa-35ddc9b2-75b8-4fb8-9e5e-dbbdf6bdd485

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35ddc9b2-75b8-4fb8-9e5e-dbbdf6bdd485
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Mon, 02 Nov 2026 09:38:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-35ddc9b2-75b8-4fb8-9e5e-dbbdf6bdd485
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 9
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3f9f5c7f-9bad-4c40-8382-8f2d4f26dea6","handle":"qa-2cd6c394b62a","displayName":"QA 2cd6c394b62a","region":"eu","role":"user","createdAt":"2026-11-02T09:38:41.803458086Z"}
```

## 54. GET /v1/accounts/me

```text
#54 GET http://localhost:7070/v1/accounts/me
correlation: qa-308188b5-ccde-4c67-a1dc-b21aa4cd37f8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-308188b5-ccde-4c67-a1dc-b21aa4cd37f8
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Mon, 02 Nov 2026 09:38:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-308188b5-ccde-4c67-a1dc-b21aa4cd37f8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 8
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3f9f5c7f-9bad-4c40-8382-8f2d4f26dea6","handle":"qa-2cd6c394b62a","displayName":"QA 2cd6c394b62a","region":"eu","role":"user","createdAt":"2026-11-02T09:38:41.803458086Z"}
```

## 55. GET /v1/accounts/me

```text
#55 GET http://localhost:7070/v1/accounts/me
correlation: qa-ccb96301-8402-4621-813d-bcefd3f07aba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ccb96301-8402-4621-813d-bcefd3f07aba
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Mon, 02 Nov 2026 09:38:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-ccb96301-8402-4621-813d-bcefd3f07aba
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 7
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3f9f5c7f-9bad-4c40-8382-8f2d4f26dea6","handle":"qa-2cd6c394b62a","displayName":"QA 2cd6c394b62a","region":"eu","role":"user","createdAt":"2026-11-02T09:38:41.803458086Z"}
```

## 56. GET /v1/accounts/me

```text
#56 GET http://localhost:7070/v1/accounts/me
correlation: qa-0995161a-3f47-440d-a43e-95c6fbc12aa9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0995161a-3f47-440d-a43e-95c6fbc12aa9
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Mon, 02 Nov 2026 09:38:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-0995161a-3f47-440d-a43e-95c6fbc12aa9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 6
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3f9f5c7f-9bad-4c40-8382-8f2d4f26dea6","handle":"qa-2cd6c394b62a","displayName":"QA 2cd6c394b62a","region":"eu","role":"user","createdAt":"2026-11-02T09:38:41.803458086Z"}
```

## 57. GET /v1/accounts/me

```text
#57 GET http://localhost:7070/v1/accounts/me
correlation: qa-ebb83558-5c9e-4484-b960-ccc73f85d4d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ebb83558-5c9e-4484-b960-ccc73f85d4d8
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Mon, 02 Nov 2026 09:38:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-ebb83558-5c9e-4484-b960-ccc73f85d4d8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 5
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3f9f5c7f-9bad-4c40-8382-8f2d4f26dea6","handle":"qa-2cd6c394b62a","displayName":"QA 2cd6c394b62a","region":"eu","role":"user","createdAt":"2026-11-02T09:38:41.803458086Z"}
```

## 58. GET /v1/accounts/me

```text
#58 GET http://localhost:7070/v1/accounts/me
correlation: qa-2e71589b-d0a2-464f-b6f9-40cf851c5593

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e71589b-d0a2-464f-b6f9-40cf851c5593
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Mon, 02 Nov 2026 09:38:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-2e71589b-d0a2-464f-b6f9-40cf851c5593
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 4
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3f9f5c7f-9bad-4c40-8382-8f2d4f26dea6","handle":"qa-2cd6c394b62a","displayName":"QA 2cd6c394b62a","region":"eu","role":"user","createdAt":"2026-11-02T09:38:41.803458086Z"}
```

## 59. GET /v1/accounts/me

```text
#59 GET http://localhost:7070/v1/accounts/me
correlation: qa-4282b9cf-904f-4bf9-9cb8-02a64cf765c8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4282b9cf-904f-4bf9-9cb8-02a64cf765c8
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Mon, 02 Nov 2026 09:38:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-4282b9cf-904f-4bf9-9cb8-02a64cf765c8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 3
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3f9f5c7f-9bad-4c40-8382-8f2d4f26dea6","handle":"qa-2cd6c394b62a","displayName":"QA 2cd6c394b62a","region":"eu","role":"user","createdAt":"2026-11-02T09:38:41.803458086Z"}
```

## 60. GET /v1/accounts/me

```text
#60 GET http://localhost:7070/v1/accounts/me
correlation: qa-8a0b3e14-eedc-4ebb-89aa-24cc4c43d34a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8a0b3e14-eedc-4ebb-89aa-24cc4c43d34a
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Mon, 02 Nov 2026 09:38:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-8a0b3e14-eedc-4ebb-89aa-24cc4c43d34a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 2
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3f9f5c7f-9bad-4c40-8382-8f2d4f26dea6","handle":"qa-2cd6c394b62a","displayName":"QA 2cd6c394b62a","region":"eu","role":"user","createdAt":"2026-11-02T09:38:41.803458086Z"}
```

## 61. GET /v1/accounts/me

```text
#61 GET http://localhost:7070/v1/accounts/me
correlation: qa-1e21c29d-5c60-4ba3-9c82-7f4cdc7e2101

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e21c29d-5c60-4ba3-9c82-7f4cdc7e2101
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Mon, 02 Nov 2026 09:38:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-1e21c29d-5c60-4ba3-9c82-7f4cdc7e2101
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 1
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3f9f5c7f-9bad-4c40-8382-8f2d4f26dea6","handle":"qa-2cd6c394b62a","displayName":"QA 2cd6c394b62a","region":"eu","role":"user","createdAt":"2026-11-02T09:38:41.803458086Z"}
```

## 62. GET /v1/accounts/me

```text
#62 GET http://localhost:7070/v1/accounts/me
correlation: qa-801aee2e-58b0-4666-94a0-545e86d29f7a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-801aee2e-58b0-4666-94a0-545e86d29f7a
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Mon, 02 Nov 2026 09:38:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-801aee2e-58b0-4666-94a0-545e86d29f7a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3f9f5c7f-9bad-4c40-8382-8f2d4f26dea6","handle":"qa-2cd6c394b62a","displayName":"QA 2cd6c394b62a","region":"eu","role":"user","createdAt":"2026-11-02T09:38:41.803458086Z"}
```

## 63. GET /v1/accounts/me

```text
#63 GET http://localhost:7070/v1/accounts/me
correlation: qa-32a93f22-1667-4b1c-a31a-3716f13d0dd5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-32a93f22-1667-4b1c-a31a-3716f13d0dd5
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Mon, 02 Nov 2026 09:38:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-32a93f22-1667-4b1c-a31a-3716f13d0dd5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 10
Retry-After: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 10 second(s).","instance":"/v1/accounts/me","correlationId":"qa-32a93f22-1667-4b1c-a31a-3716f13d0dd5"}
```

## 64. GET /v1/accounts/me

```text
#64 GET http://localhost:7070/v1/accounts/me
correlation: qa-30cc6e9b-9dd7-4f31-ab2e-92c0774151f6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-30cc6e9b-9dd7-4f31-ab2e-92c0774151f6
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Mon, 02 Nov 2026 09:38:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-30cc6e9b-9dd7-4f31-ab2e-92c0774151f6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-30cc6e9b-9dd7-4f31-ab2e-92c0774151f6"}
```

## 65. GET /v1/accounts/me

```text
#65 GET http://localhost:7070/v1/accounts/me
correlation: qa-61807f15-c832-4751-87b8-68627dac829a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-61807f15-c832-4751-87b8-68627dac829a
Content-Type: application/json

--- response: 429 in 7 ms ---
Date: Mon, 02 Nov 2026 09:38:44 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-61807f15-c832-4751-87b8-68627dac829a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 8
Retry-After: 8
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-61807f15-c832-4751-87b8-68627dac829a"}
```

## 66. GET /v1/accounts/me

```text
#66 GET http://localhost:7070/v1/accounts/me
correlation: qa-1997e111-a303-4b91-884a-e8e30740c16d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1997e111-a303-4b91-884a-e8e30740c16d
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Mon, 02 Nov 2026 09:38:44 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1997e111-a303-4b91-884a-e8e30740c16d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 8
Retry-After: 8
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-1997e111-a303-4b91-884a-e8e30740c16d"}
```

## 67. GET /v1/accounts/me

```text
#67 GET http://localhost:7070/v1/accounts/me
correlation: qa-ae28ee6a-6fc7-439f-9736-f167869e3b7f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae28ee6a-6fc7-439f-9736-f167869e3b7f
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Mon, 02 Nov 2026 09:38:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ae28ee6a-6fc7-439f-9736-f167869e3b7f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 7
Retry-After: 7
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-ae28ee6a-6fc7-439f-9736-f167869e3b7f"}
```

## 68. GET /v1/accounts/me

```text
#68 GET http://localhost:7070/v1/accounts/me
correlation: qa-4ef71e7b-1d47-465f-972d-0dce33c40858

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4ef71e7b-1d47-465f-972d-0dce33c40858
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 02 Nov 2026 09:38:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4ef71e7b-1d47-465f-972d-0dce33c40858
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 7
Retry-After: 7
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-4ef71e7b-1d47-465f-972d-0dce33c40858"}
```

## 69. GET /v1/accounts/me

```text
#69 GET http://localhost:7070/v1/accounts/me
correlation: qa-574c3c9c-282c-4cf7-86a1-95f8028cff05

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-574c3c9c-282c-4cf7-86a1-95f8028cff05
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Mon, 02 Nov 2026 09:38:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-574c3c9c-282c-4cf7-86a1-95f8028cff05
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 6
Retry-After: 6
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-574c3c9c-282c-4cf7-86a1-95f8028cff05"}
```

## 70. GET /v1/accounts/me

```text
#70 GET http://localhost:7070/v1/accounts/me
correlation: qa-811210e7-98ec-43f7-83bb-20d51876f803

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-811210e7-98ec-43f7-83bb-20d51876f803
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Mon, 02 Nov 2026 09:38:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-811210e7-98ec-43f7-83bb-20d51876f803
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 6
Retry-After: 6
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-811210e7-98ec-43f7-83bb-20d51876f803"}
```

## 71. GET /v1/accounts/me

```text
#71 GET http://localhost:7070/v1/accounts/me
correlation: qa-49086c98-4317-4a73-b01f-984b9dd7fa49

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-49086c98-4317-4a73-b01f-984b9dd7fa49
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Mon, 02 Nov 2026 09:38:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-49086c98-4317-4a73-b01f-984b9dd7fa49
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 5
Retry-After: 5
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-49086c98-4317-4a73-b01f-984b9dd7fa49"}
```

## 72. GET /v1/accounts/me

```text
#72 GET http://localhost:7070/v1/accounts/me
correlation: qa-3724a94b-7260-47f4-a387-f2be06964600

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3724a94b-7260-47f4-a387-f2be06964600
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Mon, 02 Nov 2026 09:38:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3724a94b-7260-47f4-a387-f2be06964600
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 5
Retry-After: 5
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-3724a94b-7260-47f4-a387-f2be06964600"}
```

## 73. GET /v1/accounts/me

```text
#73 GET http://localhost:7070/v1/accounts/me
correlation: qa-057b8a96-917b-4634-b07b-c70db635bc36

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-057b8a96-917b-4634-b07b-c70db635bc36
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Mon, 02 Nov 2026 09:38:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-057b8a96-917b-4634-b07b-c70db635bc36
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 4
Retry-After: 4
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-057b8a96-917b-4634-b07b-c70db635bc36"}
```

## 74. GET /v1/accounts/me

```text
#74 GET http://localhost:7070/v1/accounts/me
correlation: qa-5aa0aa3c-a840-49ee-a2e4-aed83e177ac0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5aa0aa3c-a840-49ee-a2e4-aed83e177ac0
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Mon, 02 Nov 2026 09:38:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5aa0aa3c-a840-49ee-a2e4-aed83e177ac0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 4
Retry-After: 4
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-5aa0aa3c-a840-49ee-a2e4-aed83e177ac0"}
```

## 75. GET /v1/accounts/me

```text
#75 GET http://localhost:7070/v1/accounts/me
correlation: qa-c7e322e0-6765-40d3-9668-917c4f9aed89

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c7e322e0-6765-40d3-9668-917c4f9aed89
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Mon, 02 Nov 2026 09:38:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c7e322e0-6765-40d3-9668-917c4f9aed89
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 3
Retry-After: 3
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-c7e322e0-6765-40d3-9668-917c4f9aed89"}
```

## 76. GET /v1/accounts/me

```text
#76 GET http://localhost:7070/v1/accounts/me
correlation: qa-8edd25d7-b9be-45ce-b880-5ff2d43f831a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8edd25d7-b9be-45ce-b880-5ff2d43f831a
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 02 Nov 2026 09:38:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8edd25d7-b9be-45ce-b880-5ff2d43f831a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 3
Retry-After: 3
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-8edd25d7-b9be-45ce-b880-5ff2d43f831a"}
```

## 77. GET /v1/accounts/me

```text
#77 GET http://localhost:7070/v1/accounts/me
correlation: qa-18e64f63-7f14-4cfe-a031-a30677b669e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18e64f63-7f14-4cfe-a031-a30677b669e1
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Mon, 02 Nov 2026 09:38:50 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-18e64f63-7f14-4cfe-a031-a30677b669e1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 2
Retry-After: 2
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-18e64f63-7f14-4cfe-a031-a30677b669e1"}
```

## 78. GET /v1/accounts/me

```text
#78 GET http://localhost:7070/v1/accounts/me
correlation: qa-f6853530-9ba9-495d-b88a-991920ad3ebd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f6853530-9ba9-495d-b88a-991920ad3ebd
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Mon, 02 Nov 2026 09:38:50 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f6853530-9ba9-495d-b88a-991920ad3ebd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 2
Retry-After: 2
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-f6853530-9ba9-495d-b88a-991920ad3ebd"}
```

## 79. GET /v1/accounts/me

```text
#79 GET http://localhost:7070/v1/accounts/me
correlation: qa-cf22a848-f43f-4b4f-8af0-09a2b417c98e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cf22a848-f43f-4b4f-8af0-09a2b417c98e
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Mon, 02 Nov 2026 09:38:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cf22a848-f43f-4b4f-8af0-09a2b417c98e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 1
Retry-After: 1
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-cf22a848-f43f-4b4f-8af0-09a2b417c98e"}
```

## 80. GET /v1/accounts/me

```text
#80 GET http://localhost:7070/v1/accounts/me
correlation: qa-876a7f1a-2a25-4ca5-b0ed-2fd5f623cf69

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-876a7f1a-2a25-4ca5-b0ed-2fd5f623cf69
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 02 Nov 2026 09:38:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-876a7f1a-2a25-4ca5-b0ed-2fd5f623cf69
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 1
Retry-After: 1
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-876a7f1a-2a25-4ca5-b0ed-2fd5f623cf69"}
```

## 81. GET /v1/accounts/me

```text
#81 GET http://localhost:7070/v1/accounts/me
correlation: qa-ad559c1d-9d91-4032-bbc8-d44ea0f4e5af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ad559c1d-9d91-4032-bbc8-d44ea0f4e5af
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Mon, 02 Nov 2026 09:38:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-ad559c1d-9d91-4032-bbc8-d44ea0f4e5af
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
Content-Length: 181

{"id":"acc_3f9f5c7f-9bad-4c40-8382-8f2d4f26dea6","handle":"qa-2cd6c394b62a","displayName":"QA 2cd6c394b62a","region":"eu","role":"user","createdAt":"2026-11-02T09:38:41.803458086Z"}
```

## 82. DELETE /v1/accounts/me

```text
#82 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6d869e83-da64-4518-bda7-3beb6d42b747

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6d869e83-da64-4518-bda7-3beb6d42b747
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Mon, 02 Nov 2026 09:38:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6d869e83-da64-4518-bda7-3beb6d42b747
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

## 83. POST /v1/auth/token

```text
#83 POST http://localhost:7070/v1/auth/token
correlation: qa-64a1adea-319b-4f5f-8ae7-5d41f14f331e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-64a1adea-319b-4f5f-8ae7-5d41f14f331e
Content-Type: application/json

--- request body ---
{"handle":"qa-2cd6c394b62a","password":"****"}

--- response: 401 in 5 ms ---
Date: Mon, 02 Nov 2026 09:38:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-64a1adea-319b-4f5f-8ae7-5d41f14f331e
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-64a1adea-319b-4f5f-8ae7-5d41f14f331e"}
```
